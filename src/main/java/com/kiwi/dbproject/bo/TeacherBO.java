package com.kiwi.dbproject.bo;

public class TeacherBO {
    private Integer id;

    private String name;

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
