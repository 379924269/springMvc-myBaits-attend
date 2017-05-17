package com.dnp.attend.model;

import javax.persistence.*;

public class Org {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 不能名称
     */
    private String name;

    /**
     * 部门标书
     */
    private String description;

    /**
     * 父部门名称
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取不能名称
     *
     * @return name - 不能名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置不能名称
     *
     * @param name 不能名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取部门标书
     *
     * @return description - 部门标书
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置部门标书
     *
     * @param description 部门标书
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取父部门名称
     *
     * @return parentId - 父部门名称
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父部门名称
     *
     * @param parentid 父部门名称
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}