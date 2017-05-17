package com.dnp.attend.model;

import javax.persistence.*;

public class Worktime {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 工作时间名称
     */
    private String name;

    /**
     * 工作开始时间
     */
    @Column(name = "startTime")
    private String starttime;

    /**
     * 工作结束时间
     */
    @Column(name = "endTime")
    private String endtime;

    /**
     * 伐值（超次警告）
     */
    @Column(name = "warningLimit")
    private Integer warninglimit;

    /**
     * 问候语
     */
    private String greetings;

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
     * 获取工作时间名称
     *
     * @return name - 工作时间名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置工作时间名称
     *
     * @param name 工作时间名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取工作开始时间
     *
     * @return startTime - 工作开始时间
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * 设置工作开始时间
     *
     * @param starttime 工作开始时间
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取工作结束时间
     *
     * @return endTime - 工作结束时间
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置工作结束时间
     *
     * @param endtime 工作结束时间
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取伐值（超次警告）
     *
     * @return warningLimit - 伐值（超次警告）
     */
    public Integer getWarninglimit() {
        return warninglimit;
    }

    /**
     * 设置伐值（超次警告）
     *
     * @param warninglimit 伐值（超次警告）
     */
    public void setWarninglimit(Integer warninglimit) {
        this.warninglimit = warninglimit;
    }

    /**
     * 获取问候语
     *
     * @return greetings - 问候语
     */
    public String getGreetings() {
        return greetings;
    }

    /**
     * 设置问候语
     *
     * @param greetings 问候语
     */
    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }
}