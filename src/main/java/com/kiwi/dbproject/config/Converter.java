package com.kiwi.dbproject.config;

import com.kiwi.dbproject.bo.ProjectBO;
import com.kiwi.dbproject.bo.TeacherBO;
import com.kiwi.dbproject.entity.Project;
import com.kiwi.dbproject.entity.Teacher;
import com.kiwi.dbproject.vo.request.ProjectRequest;
import com.kiwi.dbproject.vo.response.ProjectResponse;
import com.kiwi.dbproject.vo.response.TeacherResponse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Converter {

    public static TeacherResponse map(TeacherBO currentUserInfo) {
        TeacherResponse teacherResponse = new TeacherResponse();
        teacherResponse.setCheckPermission(currentUserInfo.getCheckPermission());
        teacherResponse.setApprovalPermission(currentUserInfo.getApprovalPermission());
        teacherResponse.setId(currentUserInfo.getId());
        teacherResponse.setName(currentUserInfo.getName());
        teacherResponse.setNumber(currentUserInfo.getNumber());
        teacherResponse.setPosition(currentUserInfo.getPositionName());
        teacherResponse.setTitle(currentUserInfo.getTitleName());
        teacherResponse.setDepartment(currentUserInfo.getDepartmentName());
        teacherResponse.setAge(currentUserInfo.getAge());
        teacherResponse.setMobile(currentUserInfo.getMobile());
        teacherResponse.setGender(currentUserInfo.getGender());
        return teacherResponse;
    }

    public static ProjectBO map(Project project){
        ProjectBO projectBO = new ProjectBO();
        projectBO.setId(project.getId());
        projectBO.setName(project.getName());
        projectBO.setNumber(project.getNumber());
        projectBO.setStatus(project.getStatus());
        projectBO.setApproval(project.getApprovalStatus());
        projectBO.setApprovalReason(project.getApproval());
        projectBO.setApprovalUser(project.getApprovalUserId());
        projectBO.setBudget(project.getBudget());
        projectBO.setStartTime(project.getStartTime());
        projectBO.setEndTime(project.getEndTime());
        projectBO.setFileID(project.getFileId());
        projectBO.setDescription(project.getDescription());
        return projectBO;
    }

    public static ProjectResponse map(ProjectBO projectBO) {
        ProjectResponse projectResponse = new ProjectResponse();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        projectResponse.setStartTime(format.format(projectBO.getStartTime()));
        projectResponse.setEndTime(format.format(projectBO.getEndTime()));
        projectResponse.setFileName(projectBO.getFileName());
        projectResponse.setBudget(projectBO.getBudget());
        projectResponse.setId(projectBO.getId());
        projectResponse.setName(projectBO.getName());
        projectResponse.setNumber(projectBO.getNumber());
        projectResponse.setStatus(projectBO.getStatus());
        projectResponse.setApproval(projectBO.getApproval());
        projectResponse.setApprovalReason(projectBO.getApprovalReason());
        projectResponse.setDescription(projectBO.getDescription());
        projectResponse.setApprovalUserName(projectBO.getApprovalUserName());
        projectResponse.setFileID(projectBO.getFileID());
        return projectResponse;
    }

    public static ProjectBO map(ProjectRequest request) {
        ProjectBO projectBO = new ProjectBO();
        projectBO.setId(request.getId());
        projectBO.setName(request.getName());
        projectBO.setNumber(request.getNumber());
        projectBO.setStatus(request.getStatus());
        projectBO.setApproval(request.getApproval());
        projectBO.setApprovalReason(request.getApprovalReason());
        projectBO.setApprovalUserName(request.getApprovalUserName());
        projectBO.setBudget(request.getBudget());
        projectBO.setStartTime(request.getStartTime());
        projectBO.setEndTime(request.getEndTime());
        projectBO.setFileName(request.getFileName());
        projectBO.setFileID(request.getFileID());
        projectBO.setDescription(request.getDescription());
        return projectBO;
    }

    public static Project map1(ProjectBO projectBO) {
        Project project = new Project();
        project.setId(projectBO.getId());
        project.setName(projectBO.getName());
        project.setTeacherId(projectBO.getTeacherId());
        project.setFileId(projectBO.getFileID());
        project.setEndTime(projectBO.getEndTime());
        project.setStartTime(projectBO.getStartTime());
        project.setBudget(projectBO.getBudget());
        project.setStatus(projectBO.getStatus());
        project.setApprovalStatus(projectBO.getApproval());
        project.setDescription(projectBO.getDescription());
        project.setNumber(projectBO.getNumber());
        return project;
    }
}
