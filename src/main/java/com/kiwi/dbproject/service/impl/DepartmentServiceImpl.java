package com.kiwi.dbproject.service.impl;

import com.kiwi.dbproject.entity.Department;
import com.kiwi.dbproject.mapper.DepartmentMapper;
import com.kiwi.dbproject.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
