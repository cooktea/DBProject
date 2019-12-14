package com.kiwi.dbproject.controller;


import com.kiwi.dbproject.bo.TeacherBO;
import com.kiwi.dbproject.config.CacheInfo;
import com.kiwi.dbproject.entity.Teacher;
import com.kiwi.dbproject.vo.response.TeacherResponse;
import org.apache.ibatis.annotations.Param;
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
    @RequestMapping(value = "", method = RequestMethod.GET)
    public TeacherResponse getCurrentUserInfo(){
        TeacherBO currentUserInfo = CacheInfo.getCurrentUserInfo();
//        return currentUserInfo;
        return new TeacherResponse()
                .setId(1)
                .setAge(23)
                .setDepartment("计算机学院")
                .setGender("1")
                .setMobile("18936023725")
                .setPosition("办公室主任")
                .setTitle("副教授")
                .setName("KIWI")
                .setNumber("2018140580");
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public boolean login(@Param(value = "userName") String userName, String password, HttpServletResponse response) throws IOException {
        System.out.println(userName);
        System.out.println(password);
        response.sendRedirect("/index.html");
        return false;
    }
}
