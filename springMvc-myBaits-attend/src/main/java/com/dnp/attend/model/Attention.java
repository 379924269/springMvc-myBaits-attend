package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Attention {
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
     * 领导id
     */
    @Column(name = "leaderId")
    private Integer leaderid;

    /**
     * 总结是否是最新动态，1：有、2：无
     */
    @Column(name = "summaryNewest")
    private Integer summarynewest;

    /**
     * 计划是否是最新动态，1：有、2：无
     */
    @Column(name = "workPlanNewest")
    private Integer workplannewest;

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
     * 获取总结是否是最新动态，1：有、2：无
     *
     * @return summaryNewest - 总结是否是最新动态，1：有、2：无
     */
    public Integer getSummarynewest() {
        return summarynewest;
    }

    /**
     * 设置总结是否是最新动态，1：有、2：无
     *
     * @param summarynewest 总结是否是最新动态，1：有、2：无
     */
    public void setSummarynewest(Integer summarynewest) {
        this.summarynewest = summarynewest;
    }

    /**
     * 获取计划是否是最新动态，1：有、2：无
     *
     * @return workPlanNewest - 计划是否是最新动态，1：有、2：无
     */
    public Integer getWorkplannewest() {
        return workplannewest;
    }

    /**
     * 设置计划是否是最新动态，1：有、2：无
     *
     * @param workplannewest 计划是否是最新动态，1：有、2：无
     */
    public void setWorkplannewest(Integer workplannewest) {
        this.workplannewest = workplannewest;
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