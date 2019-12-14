package com.kiwi.dbproject.controller;


import com.kiwi.dbproject.bo.TeacherBO;
import com.kiwi.dbproject.config.CacheInfo;
import com.kiwi.dbproject.entity.Project;
import com.kiwi.dbproject.entity.Teacher;
import com.kiwi.dbproject.vo.request.ProjectRequest;
import com.kiwi.dbproject.vo.response.ProjectResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ProjectResponse> queryProjects(){
        List<ProjectResponse> responses = new ArrayList<>();
        ProjectResponse r1 = new ProjectResponse();
        ProjectResponse r2 = new ProjectResponse();
        r1.setName("p1");
        r1.setNumber("897897213213432");
        r1.setApproval("待审核");
        r1.setStatus("已申请");
        r2.setName("p2");
        r2.setApproval("审核失败");
        r2.setApprovalReason("原因");
        r2.setNumber("243241321321432");
        r2.setStartTime(new Date());
        r2.setEndTime(new Date());
        r2.setFileName("附件1");
        r2.setFileID(2);
        r2.setDescription("安徽省看见上帝啊四月份的哈数据库的还能奥克兰撒谎的付款了就是哈跨境电商克劳福德是按付款几乎都是科技孵化啊的数据恢复健康了大厦付款记录的哈萨克了");
        responses.add(r1);
        responses.add(r2);
        return responses;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void postProject(@RequestBody ProjectRequest request){

    }

}
