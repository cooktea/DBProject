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
@TableName("file")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("uuid")
    private Integer uuid;

    @TableField("type")
    private String type;

    public Integer getId() {
        return id;
    }

    public File setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }

    public File setName(String name) {
        this.name = name;
        return this;
    }
    public Integer getUuid() {
        return uuid;
    }

    public File setUuid(Integer uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getType() {
        return type;
    }

    public File setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "File{" +
            "id=" + id +
            ", name=" + name +
            ", uuid=" + uuid +
            ", type=" + type +
        "}";
    }
}
