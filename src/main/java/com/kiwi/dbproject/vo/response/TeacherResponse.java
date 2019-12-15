package com.kiwi.dbproject.vo.response;

public class TeacherResponse {
    private Integer id;

    private String name;

    private String number;

    private String position;

    private String department;

    private String title;

    private Integer age;

    private String mobile;

    private String gender;

    private Boolean checkPermission;

    private Boolean approvalPermission;

    public Boolean getCheckPermission() {
        return checkPermission;
    }

    public TeacherResponse setCheckPermission(Boolean checkPermission) {
        this.checkPermission = checkPermission;
        return this;
    }

    public Boolean getApprovalPermission() {
        return approvalPermission;
    }

    public TeacherResponse setApprovalPermission(Boolean approvalPermission) {
        this.approvalPermission = approvalPermission;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public TeacherResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TeacherResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public TeacherResponse setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public TeacherResponse setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public TeacherResponse setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public TeacherResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public TeacherResponse setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public TeacherResponse setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public TeacherResponse setGender(String gender) {
        this.gender = gender;
        return this;
    }
}
