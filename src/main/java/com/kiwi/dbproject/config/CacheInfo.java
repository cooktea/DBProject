package com.kiwi.dbproject.config;

import com.kiwi.dbproject.bo.TeacherBO;
import com.kiwi.dbproject.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

public class CacheInfo {

    static private Map<String, TeacherBO> cacheUserInfo = new HashMap<>();

   public static TeacherBO getCurrentUserInfo(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String sessionId = attributes.getSessionId();
       System.out.println(sessionId);
        return cacheUserInfo.get(sessionId);
    }

    public static void putUserInCache(TeacherBO teacherBO){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String sessionId = attributes.getSessionId();
        cacheUserInfo.put(sessionId, teacherBO);
    }
}
