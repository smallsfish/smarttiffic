package com.dingying.st.po;

public class Cars {
    private Long id;

    //车牌号码
    private String plateNumber;

    //车辆名称
    private String name;

    //型号
    private String model;

    //颜色
    private String color;

    //余额
    private Integer balance;

    //车辆标志
    private String flag;

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
     * 获取车牌号码
     *
     * @return plate_number - 车牌号码
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * 设置车牌号码
     *
     * @param plateNumber 车牌号码
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * 获取车辆名称
     *
     * @return name - 车辆名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置车辆名称
     *
     * @param name 车辆名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取型号
     *
     * @return model - 型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置型号
     *
     * @param model 型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取颜色
     *
     * @return color - 颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置颜色
     *
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * 获取车辆标志
     *
     * @return flag - 车辆标志
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 设置车辆标志
     *
     * @param flag 车辆标志
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }
}