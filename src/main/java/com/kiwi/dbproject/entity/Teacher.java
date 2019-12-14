package com.kiwi.dbproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("teacher")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("number")
    private String number;

    @TableField("department_id")
    private Integer departmentId;

    @TableField("position_id")
    private Integer positionId;

    @TableField("title_id")
    private Integer titleId;

    @TableField("mobile")
    private String mobile;

    @TableField("age")
    private Integer age;

    @TableField("gender")
    private String gender;

    public Integer getId() {
        return id;
    }

    public Teacher setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }
    public Integer getDepartmentId() {
        return departmentId;
    }

    public Teacher setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Integer getPositionId() {
        return positionId;
    }

    public Teacher setPositionId(Integer positionId) {
        this.positionId = positionId;
        return this;
    }
    public Integer getTitleId() {
        return titleId;
    }

    public Teacher setTitleId(Integer titleId) {
        this.titleId = titleId;
        return this;
    }
    public String getMobile() {
        return mobile;
    }

    public Teacher setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public Integer getAge() {
        return age;
    }

    public Teacher setAge(Integer age) {
        this.age = age;
        return this;
    }
    public String getGender() {
        return gender;
    }

    public Teacher setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        return "Teacher{" +
            "id=" + id +
            ", name=" + name +
            ", departmentId=" + departmentId +
            ", positionId=" + positionId +
            ", titleId=" + titleId +
            ", mobile=" + mobile +
            ", age=" + age +
            ", gender=" + gender +
        "}";
    }

    public String getNumber() {
        return number;
    }

    public Teacher setNumber(String number) {
        this.number = number;
        return this;
    }
}
