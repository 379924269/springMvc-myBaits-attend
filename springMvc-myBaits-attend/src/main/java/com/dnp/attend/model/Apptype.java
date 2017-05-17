package com.dnp.attend.model;

import javax.persistence.*;

public class Apptype {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 申请名称
     */
    private String name;

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
     * 获取申请名称
     *
     * @return name - 申请名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置申请名称
     *
     * @param name 申请名称
     */
    public void setName(String name) {
        this.name = name;
    }
}