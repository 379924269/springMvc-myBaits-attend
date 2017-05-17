package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Workplan {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 计划类型，1：个人计划、2：部门计划
     */
    private Integer type;

    /**
     * 计划状态：1：周计划、2：月计划、3：季度计划、4：年计划
     */
    private Integer status;

    /**
     * 计划开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 计划结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 月计划完成状态，1：完成、2：未完成
     */
    @Column(name = "finishStatus")
    private Integer finishstatus;

    /**
     * 月计划创建时间
     */
    @Column(name = "createdDate")
    private Date createddate;

    /**
     * 未完成原因
     */
    private String notes;

    /**
     * 月计划内容
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
     * 获取计划类型，1：个人计划、2：部门计划
     *
     * @return type - 计划类型，1：个人计划、2：部门计划
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置计划类型，1：个人计划、2：部门计划
     *
     * @param type 计划类型，1：个人计划、2：部门计划
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取计划状态：1：周计划、2：月计划、3：季度计划、4：年计划
     *
     * @return status - 计划状态：1：周计划、2：月计划、3：季度计划、4：年计划
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置计划状态：1：周计划、2：月计划、3：季度计划、4：年计划
     *
     * @param status 计划状态：1：周计划、2：月计划、3：季度计划、4：年计划
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取计划开始时间
     *
     * @return startTime - 计划开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置计划开始时间
     *
     * @param starttime 计划开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取计划结束时间
     *
     * @return endTime - 计划结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置计划结束时间
     *
     * @param endtime 计划结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取月计划完成状态，1：完成、2：未完成
     *
     * @return finishStatus - 月计划完成状态，1：完成、2：未完成
     */
    public Integer getFinishstatus() {
        return finishstatus;
    }

    /**
     * 设置月计划完成状态，1：完成、2：未完成
     *
     * @param finishstatus 月计划完成状态，1：完成、2：未完成
     */
    public void setFinishstatus(Integer finishstatus) {
        this.finishstatus = finishstatus;
    }

    /**
     * 获取月计划创建时间
     *
     * @return createdDate - 月计划创建时间
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * 设置月计划创建时间
     *
     * @param createddate 月计划创建时间
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * 获取未完成原因
     *
     * @return notes - 未完成原因
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置未完成原因
     *
     * @param notes 未完成原因
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * 获取月计划内容
     *
     * @return description - 月计划内容
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置月计划内容
     *
     * @param description 月计划内容
     */
    public void setDescription(String description) {
        this.description = description;
    }
}