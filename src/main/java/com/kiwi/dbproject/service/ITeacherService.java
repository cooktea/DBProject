package com.kiwi.dbproject.service;

import com.kiwi.dbproject.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kiwi
 * @since 2019-12-14
 */
public interface ITeacherService extends IService<Teacher> {

    Boolean login(String number, String password);

}
