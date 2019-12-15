package com.kiwi.dbproject.bo;

public class TeacherBO {
    private Integer id;

    private String name;

    private String number;

    private Integer position;

    private Integer department;

    private Integer title;

    private String positionName;

    private String departmentName;

    private String titleName;

    private Integer age;

    private String mobile;

    private String gender;

    private Boolean checkPermission;

    private Boolean approvalPermission;

    public String getNumber() {
        return number;
    }

    public TeacherBO setNumber(String number) {
        this.number = number;
        return this;
    }

    public Integer getPosition() {
        return position;
    }

    public TeacherBO setPosition(Integer position) {
        this.position = position;
        return this;
    }

    public Integer getDepartment() {
        return department;
    }

    public TeacherBO setDepartment(Integer department) {
        this.department = department;
        return this;
    }

    public Integer getTitle() {
        return title;
    }

    public TeacherBO setTitle(Integer title) {
        this.title = title;
        return this;
    }

    public String getPositionName() {
        return positionName;
    }

    public TeacherBO setPositionName(String positionName) {
        this.positionName = positionName;
        return this;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public TeacherBO setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public String getTitleName() {
        return titleName;
    }

    public TeacherBO setTitleName(String titleName) {
        this.titleName = titleName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public TeacherBO setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public TeacherBO setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public TeacherBO setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Boolean getCheckPermission() {
        return checkPermission;
    }

    public TeacherBO setCheckPermission(Boolean checkPermission) {
        this.checkPermission = checkPermission;
        return this;
    }

    public Boolean getApprovalPermission() {
        return approvalPermission;
    }

    public TeacherBO setApprovalPermission(Boolean approvalPermission) {
        this.approvalPermission = approvalPermission;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public TeacherBO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TeacherBO setName(String name) {
        this.name = name;
        return this;
    }
}
