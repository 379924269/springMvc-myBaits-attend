package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Leadergrade {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 评级描述
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
     * 评级状态：1：周评级、2：月评级、3：季度评级、4：年评级
     */
    private Integer status;

    /**
     * 评论等级，如（优秀，良好，称职，基本称职，差）
     */
    @Column(name = "gradeTypeId")
    private Integer gradetypeid;

    /**
     * 评级开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 评级结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

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
     * 获取评级描述
     *
     * @return description - 评级描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置评级描述
     *
     * @param description 评级描述
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
     * 获取评级状态：1：周评级、2：月评级、3：季度评级、4：年评级
     *
     * @return status - 评级状态：1：周评级、2：月评级、3：季度评级、4：年评级
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置评级状态：1：周评级、2：月评级、3：季度评级、4：年评级
     *
     * @param status 评级状态：1：周评级、2：月评级、3：季度评级、4：年评级
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取评论等级，如（优秀，良好，称职，基本称职，差）
     *
     * @return gradeTypeId - 评论等级，如（优秀，良好，称职，基本称职，差）
     */
    public Integer getGradetypeid() {
        return gradetypeid;
    }

    /**
     * 设置评论等级，如（优秀，良好，称职，基本称职，差）
     *
     * @param gradetypeid 评论等级，如（优秀，良好，称职，基本称职，差）
     */
    public void setGradetypeid(Integer gradetypeid) {
        this.gradetypeid = gradetypeid;
    }

    /**
     * 获取评级开始时间
     *
     * @return startTime - 评级开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置评级开始时间
     *
     * @param starttime 评级开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取评级结束时间
     *
     * @return endTime - 评级结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置评级结束时间
     *
     * @param endtime 评级结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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