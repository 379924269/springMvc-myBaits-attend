package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Attend {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 出勤日期
     */
    @Column(name = "dutyDate")
    private Date dutydate;

    /**
     * 上班签到时间
     */
    @Column(name = "startWorkStatus")
    private Integer startworkstatus;

    /**
     * 上班签到状态
     */
    @Column(name = "startWorkTime")
    private Date startworktime;

    /**
     * 请假表id
     */
    @Column(name = "appId")
    private Integer appid;

    /**
     * 下班签退时间
     */
    @Column(name = "endWorkTime")
    private Date endworktime;

    /**
     * 下班签退状态
     */
    @Column(name = "endWorkStatus")
    private Integer endworkstatus;

    /**
     * 加班，1：没加班，2：异常加班，3：正常加班, 4：节假日加班, 5:节假日异常加班,，6、周末异常加班，7、周末正常加班
     */
    @Column(name = "overTimeStatus")
    private Integer overtimestatus;

    /**
     * 加班开始时间
     */
    @Column(name = "startOverTime")
    private Date startovertime;

    /**
     * 加班结束时间
     */
    @Column(name = "endOverTime")
    private Date endovertime;

    /**
     * 员工id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 考勤情况： 1、正常考勤， 2、离线考勤
     */
    private Integer offline;

    /**
     * 请假时间段，1：无 ，2： 上午， 3：下午
     */
    @Column(name = "appTimeQuantum")
    private Integer apptimequantum;

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
     * 获取出勤日期
     *
     * @return dutyDate - 出勤日期
     */
    public Date getDutydate() {
        return dutydate;
    }

    /**
     * 设置出勤日期
     *
     * @param dutydate 出勤日期
     */
    public void setDutydate(Date dutydate) {
        this.dutydate = dutydate;
    }

    /**
     * 获取上班签到时间
     *
     * @return startWorkStatus - 上班签到时间
     */
    public Integer getStartworkstatus() {
        return startworkstatus;
    }

    /**
     * 设置上班签到时间
     *
     * @param startworkstatus 上班签到时间
     */
    public void setStartworkstatus(Integer startworkstatus) {
        this.startworkstatus = startworkstatus;
    }

    /**
     * 获取上班签到状态
     *
     * @return startWorkTime - 上班签到状态
     */
    public Date getStartworktime() {
        return startworktime;
    }

    /**
     * 设置上班签到状态
     *
     * @param startworktime 上班签到状态
     */
    public void setStartworktime(Date startworktime) {
        this.startworktime = startworktime;
    }

    /**
     * 获取请假表id
     *
     * @return appId - 请假表id
     */
    public Integer getAppid() {
        return appid;
    }

    /**
     * 设置请假表id
     *
     * @param appid 请假表id
     */
    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    /**
     * 获取下班签退时间
     *
     * @return endWorkTime - 下班签退时间
     */
    public Date getEndworktime() {
        return endworktime;
    }

    /**
     * 设置下班签退时间
     *
     * @param endworktime 下班签退时间
     */
    public void setEndworktime(Date endworktime) {
        this.endworktime = endworktime;
    }

    /**
     * 获取下班签退状态
     *
     * @return endWorkStatus - 下班签退状态
     */
    public Integer getEndworkstatus() {
        return endworkstatus;
    }

    /**
     * 设置下班签退状态
     *
     * @param endworkstatus 下班签退状态
     */
    public void setEndworkstatus(Integer endworkstatus) {
        this.endworkstatus = endworkstatus;
    }

    /**
     * 获取加班，1：没加班，2：异常加班，3：正常加班, 4：节假日加班, 5:节假日异常加班,，6、周末异常加班，7、周末正常加班
     *
     * @return overTimeStatus - 加班，1：没加班，2：异常加班，3：正常加班, 4：节假日加班, 5:节假日异常加班,，6、周末异常加班，7、周末正常加班
     */
    public Integer getOvertimestatus() {
        return overtimestatus;
    }

    /**
     * 设置加班，1：没加班，2：异常加班，3：正常加班, 4：节假日加班, 5:节假日异常加班,，6、周末异常加班，7、周末正常加班
     *
     * @param overtimestatus 加班，1：没加班，2：异常加班，3：正常加班, 4：节假日加班, 5:节假日异常加班,，6、周末异常加班，7、周末正常加班
     */
    public void setOvertimestatus(Integer overtimestatus) {
        this.overtimestatus = overtimestatus;
    }

    /**
     * 获取加班开始时间
     *
     * @return startOverTime - 加班开始时间
     */
    public Date getStartovertime() {
        return startovertime;
    }

    /**
     * 设置加班开始时间
     *
     * @param startovertime 加班开始时间
     */
    public void setStartovertime(Date startovertime) {
        this.startovertime = startovertime;
    }

    /**
     * 获取加班结束时间
     *
     * @return endOverTime - 加班结束时间
     */
    public Date getEndovertime() {
        return endovertime;
    }

    /**
     * 设置加班结束时间
     *
     * @param endovertime 加班结束时间
     */
    public void setEndovertime(Date endovertime) {
        this.endovertime = endovertime;
    }

    /**
     * 获取员工id
     *
     * @return userId - 员工id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置员工id
     *
     * @param userid 员工id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取考勤情况： 1、正常考勤， 2、离线考勤
     *
     * @return offline - 考勤情况： 1、正常考勤， 2、离线考勤
     */
    public Integer getOffline() {
        return offline;
    }

    /**
     * 设置考勤情况： 1、正常考勤， 2、离线考勤
     *
     * @param offline 考勤情况： 1、正常考勤， 2、离线考勤
     */
    public void setOffline(Integer offline) {
        this.offline = offline;
    }

    /**
     * 获取请假时间段，1：无 ，2： 上午， 3：下午
     *
     * @return appTimeQuantum - 请假时间段，1：无 ，2： 上午， 3：下午
     */
    public Integer getApptimequantum() {
        return apptimequantum;
    }

    /**
     * 设置请假时间段，1：无 ，2： 上午， 3：下午
     *
     * @param apptimequantum 请假时间段，1：无 ，2： 上午， 3：下午
     */
    public void setApptimequantum(Integer apptimequantum) {
        this.apptimequantum = apptimequantum;
    }
}