package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class App {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "userId")
    private Integer userid;

    /**
     * 申请类型
     */
    @Column(name = "appTypeId")
    private Integer apptypeid;

    /**
     * 申请时间
     */
    @Column(name = "appTime")
    private Date apptime;

    /**
     * 请假开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 请假结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 申请原因
     */
    private String reason;

    /**
     * 审核人id
     */
    @Column(name = "checkerId")
    private Integer checkerid;

    /**
     * 审核状态，默认1,1 未审核,2: 通过，3：拒绝
     */
    @Column(name = "checkStatus")
    private Integer checkstatus;

    /**
     * 拒绝原因
     */
    @Column(name = "refuseReason")
    private String refusereason;

    /**
     * 审核时间
     */
    @Column(name = "checkTime")
    private Date checktime;

    /**
     * 延时审核，默认 1,1：正常申请,2：延时申请
     */
    private Integer delay;

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
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取申请类型
     *
     * @return appTypeId - 申请类型
     */
    public Integer getApptypeid() {
        return apptypeid;
    }

    /**
     * 设置申请类型
     *
     * @param apptypeid 申请类型
     */
    public void setApptypeid(Integer apptypeid) {
        this.apptypeid = apptypeid;
    }

    /**
     * 获取申请时间
     *
     * @return appTime - 申请时间
     */
    public Date getApptime() {
        return apptime;
    }

    /**
     * 设置申请时间
     *
     * @param apptime 申请时间
     */
    public void setApptime(Date apptime) {
        this.apptime = apptime;
    }

    /**
     * 获取请假开始时间
     *
     * @return startTime - 请假开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置请假开始时间
     *
     * @param starttime 请假开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取请假结束时间
     *
     * @return endTime - 请假结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置请假结束时间
     *
     * @param endtime 请假结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取申请原因
     *
     * @return reason - 申请原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置申请原因
     *
     * @param reason 申请原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取审核人id
     *
     * @return checkerId - 审核人id
     */
    public Integer getCheckerid() {
        return checkerid;
    }

    /**
     * 设置审核人id
     *
     * @param checkerid 审核人id
     */
    public void setCheckerid(Integer checkerid) {
        this.checkerid = checkerid;
    }

    /**
     * 获取审核状态，默认1,1 未审核,2: 通过，3：拒绝
     *
     * @return checkStatus - 审核状态，默认1,1 未审核,2: 通过，3：拒绝
     */
    public Integer getCheckstatus() {
        return checkstatus;
    }

    /**
     * 设置审核状态，默认1,1 未审核,2: 通过，3：拒绝
     *
     * @param checkstatus 审核状态，默认1,1 未审核,2: 通过，3：拒绝
     */
    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }

    /**
     * 获取拒绝原因
     *
     * @return refuseReason - 拒绝原因
     */
    public String getRefusereason() {
        return refusereason;
    }

    /**
     * 设置拒绝原因
     *
     * @param refusereason 拒绝原因
     */
    public void setRefusereason(String refusereason) {
        this.refusereason = refusereason;
    }

    /**
     * 获取审核时间
     *
     * @return checkTime - 审核时间
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
     * 设置审核时间
     *
     * @param checktime 审核时间
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    /**
     * 获取延时审核，默认 1,1：正常申请,2：延时申请
     *
     * @return delay - 延时审核，默认 1,1：正常申请,2：延时申请
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * 设置延时审核，默认 1,1：正常申请,2：延时申请
     *
     * @param delay 延时审核，默认 1,1：正常申请,2：延时申请
     */
    public void setDelay(Integer delay) {
        this.delay = delay;
    }
}