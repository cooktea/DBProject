package com.kiwi.dbproject.service.impl;

import com.kiwi.dbproject.bo.TeacherBO;
import com.kiwi.dbproject.config.CacheInfo;
import com.kiwi.dbproject.config.Converter;
import com.kiwi.dbproject.entity.Teacher;
import com.kiwi.dbproject.mapper.TeacherMapper;
import com.kiwi.dbproject.service.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Boolean login(String number, String password) {
        TeacherBO teacherBO = teacherMapper.login(number, password);
        if (teacherBO != null){
            if (teacherBO.getPosition() > 2){
                teacherBO.setApprovalPermission(true);
            }
            if (teacherBO.getPosition() > 4){
                teacherBO.setCheckPermission(true);
            }
            CacheInfo.putUserInCache(teacherBO);
        }
        return teacherBO != null;
    }
}
