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
@TableName("department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    public Integer getId() {
        return id;
    }

    public Department setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }

    public Department setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Department{" +
            "id=" + id +
            ", name=" + name +
        "}";
    }
}
