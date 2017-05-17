package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Pconoff {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 电脑开机或关机，1：开机，2：关机
     */
    @Column(name = "pcStatus")
    private Integer pcstatus;

    /**
     * 电脑开机或关机时间
     */
    @Column(name = "pcTime")
    private Date pctime;

    /**
     * 开关机原因
     */
    private String reason;

    /**
     * 考勤id
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
     * 获取电脑开机或关机，1：开机，2：关机
     *
     * @return pcStatus - 电脑开机或关机，1：开机，2：关机
     */
    public Integer getPcstatus() {
        return pcstatus;
    }

    /**
     * 设置电脑开机或关机，1：开机，2：关机
     *
     * @param pcstatus 电脑开机或关机，1：开机，2：关机
     */
    public void setPcstatus(Integer pcstatus) {
        this.pcstatus = pcstatus;
    }

    /**
     * 获取电脑开机或关机时间
     *
     * @return pcTime - 电脑开机或关机时间
     */
    public Date getPctime() {
        return pctime;
    }

    /**
     * 设置电脑开机或关机时间
     *
     * @param pctime 电脑开机或关机时间
     */
    public void setPctime(Date pctime) {
        this.pctime = pctime;
    }

    /**
     * 获取开关机原因
     *
     * @return reason - 开关机原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置开关机原因
     *
     * @param reason 开关机原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取考勤id
     *
     * @return attendId - 考勤id
     */
    public Integer getAttendid() {
        return attendid;
    }

    /**
     * 设置考勤id
     *
     * @param attendid 考勤id
     */
    public void setAttendid(Integer attendid) {
        this.attendid = attendid;
    }
}