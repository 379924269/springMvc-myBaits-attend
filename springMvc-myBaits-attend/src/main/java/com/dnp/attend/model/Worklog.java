package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Worklog {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 工作状态，1：完成， 2：未完成
     */
    @Column(name = "finishStatus")
    private Integer finishstatus;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 具体哪一天的日志
     */
    @Column(name = "actualDate")
    private Date actualdate;

    /**
     * 创建时间
     */
    @Column(name = "createdDate")
    private Date createddate;

    /**
     * 用来说明未完成原因
     */
    private String notes;

    /**
     * 周计划描述
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
     * 获取工作状态，1：完成， 2：未完成
     *
     * @return finishStatus - 工作状态，1：完成， 2：未完成
     */
    public Integer getFinishstatus() {
        return finishstatus;
    }

    /**
     * 设置工作状态，1：完成， 2：未完成
     *
     * @param finishstatus 工作状态，1：完成， 2：未完成
     */
    public void setFinishstatus(Integer finishstatus) {
        this.finishstatus = finishstatus;
    }

    /**
     * 获取用户id
     *
     * @return userId - 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取具体哪一天的日志
     *
     * @return actualDate - 具体哪一天的日志
     */
    public Date getActualdate() {
        return actualdate;
    }

    /**
     * 设置具体哪一天的日志
     *
     * @param actualdate 具体哪一天的日志
     */
    public void setActualdate(Date actualdate) {
        this.actualdate = actualdate;
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
     * 获取用来说明未完成原因
     *
     * @return notes - 用来说明未完成原因
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置用来说明未完成原因
     *
     * @param notes 用来说明未完成原因
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * 获取周计划描述
     *
     * @return description - 周计划描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置周计划描述
     *
     * @param description 周计划描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}