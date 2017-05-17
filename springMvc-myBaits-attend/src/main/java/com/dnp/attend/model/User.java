package com.dnp.attend.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 员工名称
     */
    private String name;

    /**
     * 用户性别，1：男， 2： 女
     */
    private Integer sex;

    /**
     * 别名,用户用来登陆的名称
     */
    private String alias;

    /**
     * 员工密码
     */
    private String password;

    /**
     * 用户照片
     */
    private String photo;

    /**
     * 客户端MAC地址，默认：00.00.00.00.00.00
     */
    private String mac;

    /**
     * 角色id
     */
    @Column(name = "roleId")
    private Integer roleid;

    /**
     * 部门id
     */
    @Column(name = "orgId")
    private Integer orgid;

    /**
     * 创建时间
     */
    @Column(name = "createdDate")
    private Date createddate;

    /**
     * 令牌，默认为空，用户每次登陆重新生成
     */
    private String token;

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
     * 获取员工名称
     *
     * @return name - 员工名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置员工名称
     *
     * @param name 员工名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户性别，1：男， 2： 女
     *
     * @return sex - 用户性别，1：男， 2： 女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置用户性别，1：男， 2： 女
     *
     * @param sex 用户性别，1：男， 2： 女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取别名,用户用来登陆的名称
     *
     * @return alias - 别名,用户用来登陆的名称
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置别名,用户用来登陆的名称
     *
     * @param alias 别名,用户用来登陆的名称
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取员工密码
     *
     * @return password - 员工密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置员工密码
     *
     * @param password 员工密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户照片
     *
     * @return photo - 用户照片
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置用户照片
     *
     * @param photo 用户照片
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * 获取客户端MAC地址，默认：00.00.00.00.00.00
     *
     * @return mac - 客户端MAC地址，默认：00.00.00.00.00.00
     */
    public String getMac() {
        return mac;
    }

    /**
     * 设置客户端MAC地址，默认：00.00.00.00.00.00
     *
     * @param mac 客户端MAC地址，默认：00.00.00.00.00.00
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * 获取角色id
     *
     * @return roleId - 角色id
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置角色id
     *
     * @param roleid 角色id
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取部门id
     *
     * @return orgId - 部门id
     */
    public Integer getOrgid() {
        return orgid;
    }

    /**
     * 设置部门id
     *
     * @param orgid 部门id
     */
    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
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
     * 获取令牌，默认为空，用户每次登陆重新生成
     *
     * @return token - 令牌，默认为空，用户每次登陆重新生成
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置令牌，默认为空，用户每次登陆重新生成
     *
     * @param token 令牌，默认为空，用户每次登陆重新生成
     */
    public void setToken(String token) {
        this.token = token;
    }
}