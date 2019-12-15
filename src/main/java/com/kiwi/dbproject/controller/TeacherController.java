package com.kiwi.dbproject.controller;


import com.kiwi.dbproject.bo.TeacherBO;
import com.kiwi.dbproject.config.CacheInfo;
import com.kiwi.dbproject.config.Converter;
import com.kiwi.dbproject.entity.Teacher;
import com.kiwi.dbproject.service.ITeacherService;
import com.kiwi.dbproject.vo.response.TeacherResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kiwi
 * @since 2019-12-14
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public TeacherResponse getCurrentUserInfo(){
        TeacherBO currentUserInfo = CacheInfo.getCurrentUserInfo();
        if (currentUserInfo != null){
            return Converter.map(currentUserInfo);
        }
        return null;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public boolean login(@Param(value = "userName") String userName, String password, HttpServletResponse response) throws IOException {
        Boolean correct = teacherService.login(userName, password);
        if (correct){
            response.sendRedirect("/index.html");
        }
        return correct;
    }
}
