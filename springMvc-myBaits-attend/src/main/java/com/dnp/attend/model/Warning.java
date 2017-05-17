package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Warning {
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
     * 工作时间id
     */
    @Column(name = "workTimeId")
    private Integer worktimeid;

    /**
     * 次数
     */
    private Integer times;

    /**
     * 部门查看状态，1：未查看， 2：已经查看
     */
    private Integer status;

    /**
     * 个人查看状态，1：未查看， 2：已经查看
     */
    @Column(name = "personalStatus")
    private Integer personalstatus;

    /**
     * 某月告警时间（一个月告警信息都放到里面）
     */
    @Column(name = "createdDate")
    private Date createddate;

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
     * 获取工作时间id
     *
     * @return workTimeId - 工作时间id
     */
    public Integer getWorktimeid() {
        return worktimeid;
    }

    /**
     * 设置工作时间id
     *
     * @param worktimeid 工作时间id
     */
    public void setWorktimeid(Integer worktimeid) {
        this.worktimeid = worktimeid;
    }

    /**
     * 获取次数
     *
     * @return times - 次数
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * 设置次数
     *
     * @param times 次数
     */
    public void setTimes(Integer times) {
        this.times = times;
    }

    /**
     * 获取部门查看状态，1：未查看， 2：已经查看
     *
     * @return status - 部门查看状态，1：未查看， 2：已经查看
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置部门查看状态，1：未查看， 2：已经查看
     *
     * @param status 部门查看状态，1：未查看， 2：已经查看
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取个人查看状态，1：未查看， 2：已经查看
     *
     * @return personalStatus - 个人查看状态，1：未查看， 2：已经查看
     */
    public Integer getPersonalstatus() {
        return personalstatus;
    }

    /**
     * 设置个人查看状态，1：未查看， 2：已经查看
     *
     * @param personalstatus 个人查看状态，1：未查看， 2：已经查看
     */
    public void setPersonalstatus(Integer personalstatus) {
        this.personalstatus = personalstatus;
    }

    /**
     * 获取某月告警时间（一个月告警信息都放到里面）
     *
     * @return createdDate - 某月告警时间（一个月告警信息都放到里面）
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * 设置某月告警时间（一个月告警信息都放到里面）
     *
     * @param createddate 某月告警时间（一个月告警信息都放到里面）
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }
}