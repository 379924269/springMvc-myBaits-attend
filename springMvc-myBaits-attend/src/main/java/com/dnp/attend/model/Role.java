package com.dnp.attend.model;

import javax.persistence.*;

public class Role {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色等级
     */
    private Integer level;

    /**
     * 申请延迟时间，单位天，如1天、2天等
     */
    @Column(name = "delayTime")
    private Integer delaytime;

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
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取角色等级
     *
     * @return level - 角色等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置角色等级
     *
     * @param level 角色等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取申请延迟时间，单位天，如1天、2天等
     *
     * @return delayTime - 申请延迟时间，单位天，如1天、2天等
     */
    public Integer getDelaytime() {
        return delaytime;
    }

    /**
     * 设置申请延迟时间，单位天，如1天、2天等
     *
     * @param delaytime 申请延迟时间，单位天，如1天、2天等
     */
    public void setDelaytime(Integer delaytime) {
        this.delaytime = delaytime;
    }
}