package com.kiwi.dbproject.bo;

import java.util.Date;

public class ProjectBO {

    private Integer id;

    private String name;

    private Integer teacherId;

    private String number;

    private String status;

    private String approval;

    private String approvalReason;

    private String approvalUserName;

    private Integer approvalUser;

    private Double budget;

    private Date startTime;

    private Date endTime;

    private String fileName;

    private Integer fileID;

    private String description;



    public Integer getId() {
        return id;
    }

    public ProjectBO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectBO setName(String name) {
        this.name = name;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public ProjectBO setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ProjectBO setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getApproval() {
        return approval;
    }

    public ProjectBO setApproval(String approval) {
        this.approval = approval;
        return this;
    }

    public String getApprovalReason() {
        return approvalReason;
    }

    public ProjectBO setApprovalReason(String approvalReason) {
        this.approvalReason = approvalReason;
        return this;
    }

    public String getApprovalUserName() {
        return approvalUserName;
    }

    public ProjectBO setApprovalUserName(String approvalUserName) {
        this.approvalUserName = approvalUserName;
        return this;
    }

    public Double getBudget() {
        return budget;
    }

    public ProjectBO setBudget(Double budget) {
        this.budget = budget;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public ProjectBO setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public ProjectBO setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public ProjectBO setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public Integer getFileID() {
        return fileID;
    }

    public ProjectBO setFileID(Integer fileID) {
        this.fileID = fileID;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProjectBO setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getApprovalUser() {
        return approvalUser;
    }

    public ProjectBO setApprovalUser(Integer approvalUser) {
        this.approvalUser = approvalUser;
        return this;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public ProjectBO setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
        return this;
    }
}
