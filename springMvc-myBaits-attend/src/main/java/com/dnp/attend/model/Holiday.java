package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Holiday {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 节假日标题
     */
    private String title;

    /**
     * 节假日开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 节假日结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

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
     * 获取节假日标题
     *
     * @return title - 节假日标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置节假日标题
     *
     * @param title 节假日标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取节假日开始时间
     *
     * @return startTime - 节假日开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置节假日开始时间
     *
     * @param starttime 节假日开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取节假日结束时间
     *
     * @return endTime - 节假日结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置节假日结束时间
     *
     * @param endtime 节假日结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}