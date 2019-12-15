package com.kiwi.dbproject.vo.response;

import com.kiwi.dbproject.vo.ProjectCommon;

import java.util.Date;

public class ProjectResponse extends ProjectCommon {

    private String startTime;

    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public ProjectResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public ProjectResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
}
