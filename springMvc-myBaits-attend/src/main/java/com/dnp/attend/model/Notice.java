package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class Notice {
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
     * 放上传文件的路径
     */
    private String url;

    /**
     * 置顶时间（置顶就修改它，查询按它排序）
     */
    @Column(name = "topDate")
    private Date topdate;

    /**
     * 用户id（外键）
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 创建时间
     */
    @Column(name = "createdDate")
    private Date createddate;

    /**
     * 生效时间，用在那个时候显示（比如：我想在后天显示）
     */
    @Column(name = "effectiveDate")
    private Date effectivedate;

    /**
     * 永远不过期,1：过期， 2：永不过期
     */
    @Column(name = "foreverFlag")
    private Integer foreverflag;

    /**
     * 公告的过期时间
     */
    @Column(name = "expirationDate")
    private Date expirationdate;

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
     * 获取放上传文件的路径
     *
     * @return url - 放上传文件的路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置放上传文件的路径
     *
     * @param url 放上传文件的路径
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取置顶时间（置顶就修改它，查询按它排序）
     *
     * @return topDate - 置顶时间（置顶就修改它，查询按它排序）
     */
    public Date getTopdate() {
        return topdate;
    }

    /**
     * 设置置顶时间（置顶就修改它，查询按它排序）
     *
     * @param topdate 置顶时间（置顶就修改它，查询按它排序）
     */
    public void setTopdate(Date topdate) {
        this.topdate = topdate;
    }

    /**
     * 获取用户id（外键）
     *
     * @return userId - 用户id（外键）
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户id（外键）
     *
     * @param userid 用户id（外键）
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
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
     * 获取生效时间，用在那个时候显示（比如：我想在后天显示）
     *
     * @return effectiveDate - 生效时间，用在那个时候显示（比如：我想在后天显示）
     */
    public Date getEffectivedate() {
        return effectivedate;
    }

    /**
     * 设置生效时间，用在那个时候显示（比如：我想在后天显示）
     *
     * @param effectivedate 生效时间，用在那个时候显示（比如：我想在后天显示）
     */
    public void setEffectivedate(Date effectivedate) {
        this.effectivedate = effectivedate;
    }

    /**
     * 获取永远不过期,1：过期， 2：永不过期
     *
     * @return foreverFlag - 永远不过期,1：过期， 2：永不过期
     */
    public Integer getForeverflag() {
        return foreverflag;
    }

    /**
     * 设置永远不过期,1：过期， 2：永不过期
     *
     * @param foreverflag 永远不过期,1：过期， 2：永不过期
     */
    public void setForeverflag(Integer foreverflag) {
        this.foreverflag = foreverflag;
    }

    /**
     * 获取公告的过期时间
     *
     * @return expirationDate - 公告的过期时间
     */
    public Date getExpirationdate() {
        return expirationdate;
    }

    /**
     * 设置公告的过期时间
     *
     * @param expirationdate 公告的过期时间
     */
    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }
}