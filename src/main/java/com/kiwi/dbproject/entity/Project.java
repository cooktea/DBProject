package com.kiwi.dbproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author kiwi
 * @since 2019-12-14
 */
@TableName("project")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("teacher_id")
    private Integer teacherId;

    @TableField("file_id")
    private Integer fileId;

    @TableField("description")
    private String description;

    @TableField("end_time")
    private Date endTime;

    @TableField("start_time")
    private Date startTime;

    @TableField("budget")
    private Double budget;

    @TableField("duration")
    private Integer duration;

    @TableField("status")
    private String status;

    @TableField("approval")
    private String approval;

    @TableField("approval_user_id")
    private Integer approvalUserId;

    @TableField("approval_status")
    private String approvalStatus;

    public Integer getId() {
        return id;
    }

    public Project setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }
    public Integer getTeacherId() {
        return teacherId;
    }

    public Project setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
        return this;
    }
    public Integer getFileId() {
        return fileId;
    }

    public Project setFileId(Integer fileId) {
        this.fileId = fileId;
        return this;
    }
    public Date getEndTime() {
        return endTime;
    }

    public Project setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }
    public Date getStartTime() {
        return startTime;
    }

    public Project setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }
    public Double getBudget() {
        return budget;
    }

    public Project setBudget(Double budget) {
        this.budget = budget;
        return this;
    }
    public Integer getDuration() {
        return duration;
    }

    public Project setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public String getStatus() {
        return status;
    }

    public Project setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getApproval() {
        return approval;
    }

    public Project setApproval(String approval) {
        this.approval = approval;
        return this;
    }
    public Integer getApprovalUserId() {
        return approvalUserId;
    }

    public Project setApprovalUserId(Integer approvalUserId) {
        this.approvalUserId = approvalUserId;
        return this;
    }
    public String getApprovalStatus() {
        return approvalStatus;
    }

    public Project setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }

    @Override
    public String toString() {
        return "Project{" +
            "id=" + id +
            ", name=" + name +
            ", teacherId=" + teacherId +
            ", fileId=" + fileId +
            ", endTime=" + endTime +
            ", startTime=" + startTime +
            ", budget=" + budget +
            ", duration=" + duration +
            ", status=" + status +
            ", approval=" + approval +
            ", approvalUserId=" + approvalUserId +
            ", approvalStatus=" + approvalStatus +
        "}";
    }

    public String getDescription() {
        return description;
    }

    public Project setDescription(String description) {
        this.description = description;
        return this;
    }
}
