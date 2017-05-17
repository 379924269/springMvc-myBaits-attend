package com.dnp.attend.model;

import javax.persistence.*;

public class Checkercheckgroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 审核人id
     */
    @Column(name = "checkerId")
    private Integer checkerid;

    /**
     * 审核组id
     */
    @Column(name = "checkGroupId")
    private Integer checkgroupid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取审核人id
     *
     * @return checkerId - 审核人id
     */
    public Integer getCheckerid() {
        return checkerid;
    }

    /**
     * 设置审核人id
     *
     * @param checkerid 审核人id
     */
    public void setCheckerid(Integer checkerid) {
        this.checkerid = checkerid;
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