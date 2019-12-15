package com.kiwi.dbproject.controller;


import com.kiwi.dbproject.bo.ProjectBO;
import com.kiwi.dbproject.bo.TeacherBO;
import com.kiwi.dbproject.config.CacheInfo;
import com.kiwi.dbproject.config.Converter;
import com.kiwi.dbproject.entity.Project;
import com.kiwi.dbproject.entity.Teacher;
import com.kiwi.dbproject.service.IProjectService;
import com.kiwi.dbproject.vo.request.ProjectRequest;
import com.kiwi.dbproject.vo.response.ProjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kiwi
 * @since 2019-12-14
 */
@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private IProjectService projectService;

    @RequestMapping(value = "/approval", method = RequestMethod.GET)
    public List<ProjectResponse> queryApprovalProjects(){
        List<ProjectBO> projectBOS = projectService.queryProjectsByApprovalStatus("待审核");
        return projectBOS.stream().map(Converter::map).collect(Collectors.toList());
    }

    @RequestMapping(value = "/approval/pass", method = RequestMethod.GET)
    public void passApproval(Integer id, HttpServletResponse response){
        projectService.passApproval(id);
        try {
            PrintWriter writer = response.getWriter();
            response.setHeader("refresh","1;URL=http://localhost:8080/approval.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/approval/refuse", method = RequestMethod.GET)
    public void refuseApproval(Integer id, HttpServletResponse response){
        projectService.refuseApproval(id);
        try {
            PrintWriter writer = response.getWriter();
            response.setHeader("refresh","1;URL=http://localhost:8080/approval.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/check/pass", method = RequestMethod.GET)
    public void passCheck(Integer id, HttpServletResponse response){
        projectService.passCheck(id);
        try {
            PrintWriter writer = response.getWriter();
            response.setHeader("refresh","1;URL=http://localhost:8080/check.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/check/refuse", method = RequestMethod.GET)
    public void refuseCheck(Integer id, HttpServletResponse response){
        projectService.refuseCheck(id);
        try {
            PrintWriter writer = response.getWriter();
            response.setHeader("refresh","1;URL=http://localhost:8080/check.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public List<ProjectResponse> queryCheckProjects(){
        List<ProjectBO> projectBOS = projectService.queryProjectsByStatus("待验收");
        return projectBOS.stream().map(Converter::map).collect(Collectors.toList());
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ProjectResponse> queryProjects(){
        List<ProjectBO> projectBOS = projectService.queryProjectsByUserId(CacheInfo.getCurrentUserInfo().getId());
        return projectBOS.stream().map(Converter::map).collect(Collectors.toList());
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void postProject(@RequestBody ProjectRequest request){
        ProjectBO projectBO = Converter.map(request);
        projectService.applyProject(projectBO);
    }

}
