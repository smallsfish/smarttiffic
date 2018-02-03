package com.dingying.st.po;

public class Road {
    private Integer id;

    //道路名称
    private String name;

    //拥挤状态 0-畅通 ， 1-缓行，2-一般拥堵，3-中度拥堵，4-严重拥堵
    private Byte crowdStatus;

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
     * 获取道路名称
     *
     * @return name - 道路名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置道路名称
     *
     * @param name 道路名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取拥挤状态 0-畅通 ， 1-缓行，2-一般拥堵，3-中度拥堵，4-严重拥堵
     *
     * @return crowd_status - 拥挤状态 0-畅通 ， 1-缓行，2-一般拥堵，3-中度拥堵，4-严重拥堵
     */
    public Byte getCrowdStatus() {
        return crowdStatus;
    }

    /**
     * 设置拥挤状态 0-畅通 ， 1-缓行，2-一般拥堵，3-中度拥堵，4-严重拥堵
     *
     * @param crowdStatus 拥挤状态 0-畅通 ， 1-缓行，2-一般拥堵，3-中度拥堵，4-严重拥堵
     */
    public void setCrowdStatus(Byte crowdStatus) {
        this.crowdStatus = crowdStatus;
    }
}