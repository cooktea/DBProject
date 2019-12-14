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
@TableName("title")
public class Title implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    public Integer getId() {
        return id;
    }

    public Title setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }

    public Title setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Title{" +
            "id=" + id +
            ", name=" + name +
        "}";
    }
}
