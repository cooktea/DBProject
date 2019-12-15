package com.kiwi.dbproject.service;

import com.kiwi.dbproject.bo.ProjectBO;
import com.kiwi.dbproject.entity.Project;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kiwi
 * @since 2019-12-14
 */
public interface IProjectService extends IService<Project> {

    List<ProjectBO> queryProjectsByUserId(Integer userId);

    List<ProjectBO> queryProjectsByApprovalStatus(String status);

    List<ProjectBO> queryProjectsByStatus(String status);

    void passApproval(Integer id);

    void refuseApproval(Integer id);

    void passCheck(Integer id);

    void refuseCheck(Integer id);

    void applyProject(ProjectBO projectBO);


}
