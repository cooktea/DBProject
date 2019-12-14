package com.kiwi.dbproject.vo;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ProjectCommon {

    private Integer id;

    private String name;

    private String number;

    private String status;

    private String approval;

    private String approvalReason;

    private String approvalUserName;

    private Double budget;

    private Date startTime;

    private Date endTime;

    private String fileName;

    private Integer fileID;

    private String description;

    @Override
    public String toString() {
        return "ProjectCommon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", status='" + status + '\'' +
                ", approval='" + approval + '\'' +
                ", approvalReason='" + approvalReason + '\'' +
                ", approvalUserName='" + approvalUserName + '\'' +
                ", budget=" + budget +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", fileName='" + fileName + '\'' +
                ", fileID=" + fileID +
                ", description='" + description + '\'' +
                '}';
    }

    public String getFileName() {
        return fileName;
    }

    public ProjectCommon setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public Double getBudget() {
        return budget;
    }

    public ProjectCommon setBudget(Double budget) {
        this.budget = budget;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public ProjectCommon setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public ProjectCommon setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public ProjectCommon setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectCommon setName(String name) {
        this.name = name;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public ProjectCommon setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ProjectCommon setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getApproval() {
        return approval;
    }

    public ProjectCommon setApproval(String approval) {
        this.approval = approval;
        return this;
    }

    public String getApprovalReason() {
        return approvalReason;
    }

    public ProjectCommon setApprovalReason(String approvalReason) {
        this.approvalReason = approvalReason;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProjectCommon setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getApprovalUserName() {
        return approvalUserName;
    }

    public ProjectCommon setApprovalUserName(String approvalUserName) {
        this.approvalUserName = approvalUserName;
        return this;
    }

    public Integer getFileID() {
        return fileID;
    }

    public ProjectCommon setFileID(Integer fileID) {
        this.fileID = fileID;
        return this;
    }
}
