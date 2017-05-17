package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Thumbsup {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 描述点赞
     */
    private String description;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 领导id
     */
    @Column(name = "leaderId")
    private Integer leaderid;

    /**
     * 自己看没，1：看了，2没看
     */
    @Column(name = "selfSeeFlag")
    private Integer selfseeflag;

    /**
     * 总结文件id
     */
    @Column(name = "summaryId")
    private Integer summaryid;

    /**
     * 工作计划id
     */
    @Column(name = "workPlanId")
    private Integer workplanid;

    /**
     * 创建时间
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
     * 获取描述点赞
     *
     * @return description - 描述点赞
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述点赞
     *
     * @param description 描述点赞
     */
    public void setDescription(String description) {
        this.description = description;
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
     * 获取领导id
     *
     * @return leaderId - 领导id
     */
    public Integer getLeaderid() {
        return leaderid;
    }

    /**
     * 设置领导id
     *
     * @param leaderid 领导id
     */
    public void setLeaderid(Integer leaderid) {
        this.leaderid = leaderid;
    }

    /**
     * 获取自己看没，1：看了，2没看
     *
     * @return selfSeeFlag - 自己看没，1：看了，2没看
     */
    public Integer getSelfseeflag() {
        return selfseeflag;
    }

    /**
     * 设置自己看没，1：看了，2没看
     *
     * @param selfseeflag 自己看没，1：看了，2没看
     */
    public void setSelfseeflag(Integer selfseeflag) {
        this.selfseeflag = selfseeflag;
    }

    /**
     * 获取总结文件id
     *
     * @return summaryId - 总结文件id
     */
    public Integer getSummaryid() {
        return summaryid;
    }

    /**
     * 设置总结文件id
     *
     * @param summaryid 总结文件id
     */
    public void setSummaryid(Integer summaryid) {
        this.summaryid = summaryid;
    }

    /**
     * 获取工作计划id
     *
     * @return workPlanId - 工作计划id
     */
    public Integer getWorkplanid() {
        return workplanid;
    }

    /**
     * 设置工作计划id
     *
     * @param workplanid 工作计划id
     */
    public void setWorkplanid(Integer workplanid) {
        this.workplanid = workplanid;
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
}