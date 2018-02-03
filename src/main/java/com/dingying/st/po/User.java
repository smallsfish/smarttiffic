package com.dingying.st.po;

import java.util.Date;

public class User {
    //主键id
    private Long id;

    //账号
    private String account;

    //姓名
    private String name;

    //加密密钥
    private String salt;

    //密码
    private String password;

    //身份证号码
    private String idNumber;

    //年龄
    private Byte age;

    //性别：0-女，1-男
    private Boolean sex;

    //电话号码
    private String phone;

    //用户创建时间
    private Date createdate;

    //用户车辆余额最低阀值
    private Integer threshold;

    //用户状态：0-锁定，1-正常，2-审核...
    private Byte status;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取加密密钥
     *
     * @return salt - 加密密钥
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置加密密钥
     *
     * @param salt 加密密钥
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取身份证号码
     *
     * @return id_number - 身份证号码
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置身份证号码
     *
     * @param idNumber 身份证号码
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Byte getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * 获取性别：0-女，1-男
     *
     * @return sex - 性别：0-女，1-男
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置性别：0-女，1-男
     *
     * @param sex 性别：0-女，1-男
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户创建时间
     *
     * @return createdate - 用户创建时间
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置用户创建时间
     *
     * @param createdate 用户创建时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取用户车辆余额最低阀值
     *
     * @return threshold - 用户车辆余额最低阀值
     */
    public Integer getThreshold() {
        return threshold;
    }

    /**
     * 设置用户车辆余额最低阀值
     *
     * @param threshold 用户车辆余额最低阀值
     */
    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    /**
     * 获取用户状态：0-锁定，1-正常，2-审核...
     *
     * @return status - 用户状态：0-锁定，1-正常，2-审核...
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置用户状态：0-锁定，1-正常，2-审核...
     *
     * @param status 用户状态：0-锁定，1-正常，2-审核...
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}