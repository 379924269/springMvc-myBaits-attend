package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Pcfreelog {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 空闲开始时间
     */
    @Column(name = "startFreeTime")
    private Date startfreetime;

    /**
     * 空闲结束时间
     */
    @Column(name = "endFreeTime")
    private Date endfreetime;

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
     * 获取空闲开始时间
     *
     * @return startFreeTime - 空闲开始时间
     */
    public Date getStartfreetime() {
        return startfreetime;
    }

    /**
     * 设置空闲开始时间
     *
     * @param startfreetime 空闲开始时间
     */
    public void setStartfreetime(Date startfreetime) {
        this.startfreetime = startfreetime;
    }

    /**
     * 获取空闲结束时间
     *
     * @return endFreeTime - 空闲结束时间
     */
    public Date getEndfreetime() {
        return endfreetime;
    }

    /**
     * 设置空闲结束时间
     *
     * @param endfreetime 空闲结束时间
     */
    public void setEndfreetime(Date endfreetime) {
        this.endfreetime = endfreetime;
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