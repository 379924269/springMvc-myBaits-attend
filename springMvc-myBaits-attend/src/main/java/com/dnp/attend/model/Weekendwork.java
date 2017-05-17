package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Weekendwork {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 周末上班时间
     */
    @Column(name = "workOnDate")
    private Date workondate;

    /**
     * 周末上班描述
     */
    private String description;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取周末上班时间
     *
     * @return workOnDate - 周末上班时间
     */
    public Date getWorkondate() {
        return workondate;
    }

    /**
     * 设置周末上班时间
     *
     * @param workondate 周末上班时间
     */
    public void setWorkondate(Date workondate) {
        this.workondate = workondate;
    }

    /**
     * 获取周末上班描述
     *
     * @return description - 周末上班描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置周末上班描述
     *
     * @param description 周末上班描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}