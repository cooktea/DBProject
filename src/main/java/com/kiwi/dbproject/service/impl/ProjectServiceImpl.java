package com.kiwi.dbproject.service.impl;

import com.kiwi.dbproject.entity.Project;
import com.kiwi.dbproject.mapper.ProjectMapper;
import com.kiwi.dbproject.service.IProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
