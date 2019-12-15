package com.kiwi.dbproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kiwi.dbproject.bo.ProjectBO;
import com.kiwi.dbproject.config.CacheInfo;
import com.kiwi.dbproject.config.Converter;
import com.kiwi.dbproject.entity.File;
import com.kiwi.dbproject.entity.Project;
import com.kiwi.dbproject.entity.Teacher;
import com.kiwi.dbproject.mapper.ProjectMapper;
import com.kiwi.dbproject.service.IFileService;
import com.kiwi.dbproject.service.IProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kiwi.dbproject.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kiwi
 * @since 2019-12-14
 */
@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements IProjectService {

    @Autowired
    ProjectMapper projectMapper;

    @Autowired
    private IFileService fileService;

    @Autowired
    private ITeacherService teacherService;

    @Override
    public List<ProjectBO> queryProjectsByUserId(Integer userId) {
        List<Project> projects = this.query().eq("teacher_id", userId).list();
        List<ProjectBO> projectBOS = projects.stream().map(Converter::map).collect(Collectors.toList());
        projectBOS.forEach(e -> {
            if (e.getFileID() != null){
                e.setFileName(fileService.getOne(new QueryWrapper<File>().eq("id",e.getFileID())).getName());
            }
            if (e.getApprovalUser() != null){
                e.setApprovalUserName(teacherService.getOne(new QueryWrapper<Teacher>().eq("id", e.getApprovalUser())).getName());
            }
        });
        return projectBOS;
    }

    @Override
    public List<ProjectBO> queryProjectsByApprovalStatus(String status) {
        List<Project> projects = this.query().eq("approval_status",status).list();
        List<ProjectBO> projectBOS = projects.stream().map(Converter::map).collect(Collectors.toList());
        projectBOS.forEach(e -> {
            if (e.getFileID() != null){
                e.setFileName(fileService.getOne(new QueryWrapper<File>().eq("id",e.getFileID())).getName());
            }
            if (e.getApprovalUser() != null){
                e.setApprovalUserName(teacherService.getOne(new QueryWrapper<Teacher>().eq("id", e.getApprovalUser())).getName());
            }
        });
        return projectBOS;
    }

    @Override
    public List<ProjectBO> queryProjectsByStatus(String status) {
        List<Project> projects = this.query().eq("status", status).list();
        List<ProjectBO> projectBOS = projects.stream().map(Converter::map).collect(Collectors.toList());
        projectBOS.forEach(e -> {
            if (e.getFileID() != null){
                e.setFileName(fileService.getOne(new QueryWrapper<File>().eq("id",e.getFileID())).getName());
            }
            if (e.getApprovalUser() != null){
                e.setApprovalUserName(teacherService.getOne(new QueryWrapper<Teacher>().eq("id", e.getApprovalUser())).getName());
            }
        });
        return projectBOS;
    }

    @Override
    @Transactional
    public void passApproval(Integer id) {
        Project project = this.getById(id);
        project.setApprovalUserId(CacheInfo.getCurrentUserInfo().getId());
        project.setApprovalStatus("审核通过");
        project.setStatus("待验收");
        this.updateById(project);
    }

    @Override
    public void refuseApproval(Integer id) {
        Project project = this.getById(id);
        project.setApprovalUserId(CacheInfo.getCurrentUserInfo().getId());
        project.setApprovalStatus("审核不通过");
        project.setStatus("审核不通过");
        this.updateById(project);
    }

    @Override
    public void passCheck(Integer id) {
        Project project = this.getById(id);
        project.setStatus("验收通过");
        project.setStatus("已完成");
        this.updateById(project);
    }

    @Override
    public void refuseCheck(Integer id) {
        Project project = this.getById(id);
        project.setStatus("验收不通过");
        project.setStatus("验收不通过");
        this.updateById(project);
    }

    @Override
    @Transactional
    public void applyProject(ProjectBO projectBO) {
        projectBO.setTeacherId(CacheInfo.getCurrentUserInfo().getId());
        projectBO.setNumber(UUID.randomUUID().toString().replace("-",""));
        projectBO.setStatus("待审核");
        projectBO.setApproval("待审核");
        Project project = Converter.map1(projectBO);
        projectMapper.insert(project);
    }

}
