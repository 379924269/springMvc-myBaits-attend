package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Checkgroup {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 审核组名称
     */
    private String name;

    /**
     * 创建者id
     */
    @Column(name = "creatorId")
    private Integer creatorid;

    /**
     * 创建时间
     */
    @Column(name = "createdDate")
    private Date createddate;

    /**
     * 审核组描述
     */
    private String description;

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
     * 获取审核组名称
     *
     * @return name - 审核组名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置审核组名称
     *
     * @param name 审核组名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取创建者id
     *
     * @return creatorId - 创建者id
     */
    public Integer getCreatorid() {
        return creatorid;
    }

    /**
     * 设置创建者id
     *
     * @param creatorid 创建者id
     */
    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
    }

    /**
     * 获取创建时间
     *
     * @return createdDate - 创建时间
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * 设置创建时间
     *
     * @param createddate 创建时间
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * 获取审核组描述
     *
     * @return description - 审核组描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置审核组描述
     *
     * @param description 审核组描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}