package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Summary {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 创建者id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 总结类型，1：个人总结、2：部门总结
     */
    private Integer type;

    /**
     * 总结状态，1：周总结、2：月总结、3：季度总结、4：年总结
     */
    private Integer status;

    /**
     * 总结开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 总结结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 创建时间
     */
    @Column(name = "createdDate")
    private Date createddate;

    /**
     * 文件总结内容
     */
    private String description;

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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取创建者id
     *
     * @return userId - 创建者id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置创建者id
     *
     * @param userid 创建者id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取总结类型，1：个人总结、2：部门总结
     *
     * @return type - 总结类型，1：个人总结、2：部门总结
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置总结类型，1：个人总结、2：部门总结
     *
     * @param type 总结类型，1：个人总结、2：部门总结
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取总结状态，1：周总结、2：月总结、3：季度总结、4：年总结
     *
     * @return status - 总结状态，1：周总结、2：月总结、3：季度总结、4：年总结
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置总结状态，1：周总结、2：月总结、3：季度总结、4：年总结
     *
     * @param status 总结状态，1：周总结、2：月总结、3：季度总结、4：年总结
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取总结开始时间
     *
     * @return startTime - 总结开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置总结开始时间
     *
     * @param starttime 总结开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取总结结束时间
     *
     * @return endTime - 总结结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置总结结束时间
     *
     * @param endtime 总结结束时间
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

    /**
     * 获取文件总结内容
     *
     * @return description - 文件总结内容
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置文件总结内容
     *
     * @param description 文件总结内容
     */
    public void setDescription(String description) {
        this.description = description;
    }
}