package com.dingying.st.po;

import java.util.Date;

public class Recharge {
    private Long id;

    //充值用户
    private Long rechargeUser;

    //操作人
    private String rechargeAccess;

    //充值金额
    private Integer rechargeMoney;

    //历史金额
    private Integer oldMoney;

    //充值时间
    private Date rechargeTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取充值用户
     *
     * @return recharge_user - 充值用户
     */
    public Long getRechargeUser() {
        return rechargeUser;
    }

    /**
     * 设置充值用户
     *
     * @param rechargeUser 充值用户
     */
    public void setRechargeUser(Long rechargeUser) {
        this.rechargeUser = rechargeUser;
    }

    /**
     * 获取操作人
     *
     * @return recharge_access - 操作人
     */
    public String getRechargeAccess() {
        return rechargeAccess;
    }

    /**
     * 设置操作人
     *
     * @param rechargeAccess 操作人
     */
    public void setRechargeAccess(String rechargeAccess) {
        this.rechargeAccess = rechargeAccess;
    }

    /**
     * 获取充值金额
     *
     * @return recharge_money - 充值金额
     */
    public Integer getRechargeMoney() {
        return rechargeMoney;
    }

    /**
     * 设置充值金额
     *
     * @param rechargeMoney 充值金额
     */
    public void setRechargeMoney(Integer rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    /**
     * 获取历史金额
     *
     * @return old_money - 历史金额
     */
    public Integer getOldMoney() {
        return oldMoney;
    }

    /**
     * 设置历史金额
     *
     * @param oldMoney 历史金额
     */
    public void setOldMoney(Integer oldMoney) {
        this.oldMoney = oldMoney;
    }

    /**
     * 获取充值时间
     *
     * @return recharge_time - 充值时间
     */
    public Date getRechargeTime() {
        return rechargeTime;
    }

    /**
     * 设置充值时间
     *
     * @param rechargeTime 充值时间
     */
    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }
}