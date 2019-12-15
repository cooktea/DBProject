package com.kiwi.dbproject.mapper;

import com.kiwi.dbproject.bo.TeacherBO;
import com.kiwi.dbproject.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kiwi
 * @since 2019-12-14
 */
public interface TeacherMapper extends BaseMapper<Teacher> {

    TeacherBO queryTeacherById(Integer id);

    TeacherBO login(String number, String password);
}
