package com.kiwi.dbproject.vo.request;

import com.kiwi.dbproject.vo.ProjectCommon;

import java.util.Date;

public class ProjectRequest extends ProjectCommon {
    private Date startTime;

    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public ProjectRequest setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public ProjectRequest setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }
}
