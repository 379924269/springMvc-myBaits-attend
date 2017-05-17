package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Pcautooff {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 异常（自动）关机时间
     */
    @Column(name = "offTime")
    private Date offtime;

    /**
     * 异常（自动）关机状态，1：下班异常关机，2：加班异常关机
     */
    @Column(name = "offStatus")
    private Integer offstatus;

    /**
     * 异常（自动）关机原因
     */
    private String reason;

    /**
     * 异常（自动）关机处理人id（用户id）
     */
    @Column(name = "checkerId")
    private Integer checkerid;

    /**
     * 异常（自动）关机处理人时间
     */
    @Column(name = "checkTime")
    private Date checktime;

    /**
     * 异常（自动）关机处理状态
     */
    @Column(name = "checkStatus")
    private Integer checkstatus;

    /**
     * 考勤attendId
     */
    @Column(name = "attendId")
    private Integer attendid;

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
     * 获取异常（自动）关机时间
     *
     * @return offTime - 异常（自动）关机时间
     */
    public Date getOfftime() {
        return offtime;
    }

    /**
     * 设置异常（自动）关机时间
     *
     * @param offtime 异常（自动）关机时间
     */
    public void setOfftime(Date offtime) {
        this.offtime = offtime;
    }

    /**
     * 获取异常（自动）关机状态，1：下班异常关机，2：加班异常关机
     *
     * @return offStatus - 异常（自动）关机状态，1：下班异常关机，2：加班异常关机
     */
    public Integer getOffstatus() {
        return offstatus;
    }

    /**
     * 设置异常（自动）关机状态，1：下班异常关机，2：加班异常关机
     *
     * @param offstatus 异常（自动）关机状态，1：下班异常关机，2：加班异常关机
     */
    public void setOffstatus(Integer offstatus) {
        this.offstatus = offstatus;
    }

    /**
     * 获取异常（自动）关机原因
     *
     * @return reason - 异常（自动）关机原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置异常（自动）关机原因
     *
     * @param reason 异常（自动）关机原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取异常（自动）关机处理人id（用户id）
     *
     * @return checkerId - 异常（自动）关机处理人id（用户id）
     */
    public Integer getCheckerid() {
        return checkerid;
    }

    /**
     * 设置异常（自动）关机处理人id（用户id）
     *
     * @param checkerid 异常（自动）关机处理人id（用户id）
     */
    public void setCheckerid(Integer checkerid) {
        this.checkerid = checkerid;
    }

    /**
     * 获取异常（自动）关机处理人时间
     *
     * @return checkTime - 异常（自动）关机处理人时间
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
     * 设置异常（自动）关机处理人时间
     *
     * @param checktime 异常（自动）关机处理人时间
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    /**
     * 获取异常（自动）关机处理状态
     *
     * @return checkStatus - 异常（自动）关机处理状态
     */
    public Integer getCheckstatus() {
        return checkstatus;
    }

    /**
     * 设置异常（自动）关机处理状态
     *
     * @param checkstatus 异常（自动）关机处理状态
     */
    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }

    /**
     * 获取考勤attendId
     *
     * @return attendId - 考勤attendId
     */
    public Integer getAttendid() {
        return attendid;
    }

    /**
     * 设置考勤attendId
     *
     * @param attendid 考勤attendId
     */
    public void setAttendid(Integer attendid) {
        this.attendid = attendid;
    }
}