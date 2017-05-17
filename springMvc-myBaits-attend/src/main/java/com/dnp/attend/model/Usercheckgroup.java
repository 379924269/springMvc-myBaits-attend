package com.dnp.attend.model;

import javax.persistence.*;

public class Usercheckgroup {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 审核组id
     */
    @Column(name = "checkGroupId")
    private Integer checkgroupid;

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
     * 获取用户id
     *
     * @return userId - 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取审核组id
     *
     * @return checkGroupId - 审核组id
     */
    public Integer getCheckgroupid() {
        return checkgroupid;
    }

    /**
     * 设置审核组id
     *
     * @param checkgroupid 审核组id
     */
    public void setCheckgroupid(Integer checkgroupid) {
        this.checkgroupid = checkgroupid;
    }
}