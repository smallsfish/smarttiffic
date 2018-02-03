package com.dingying.st.po;

public class Bus {
    private Long id;

    //线路
    private String lineName;

    //速度
    private String speed;

    //方向
    private Boolean direction;

    //途径站台
    private String stations;

    //当前站台
    private String currentStation;

    //最大负载
    private Integer maxLoad;

    //当前负载
    private Integer curLoad;

    //首班车时间
    private String first;

    //末班车时间
    private String last;

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
     * 获取线路
     *
     * @return line_name - 线路
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * 设置线路
     *
     * @param lineName 线路
     */
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    /**
     * 获取速度
     *
     * @return speed - 速度
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * 设置速度
     *
     * @param speed 速度
     */
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    /**
     * 获取方向
     *
     * @return direction - 方向
     */
    public Boolean getDirection() {
        return direction;
    }

    /**
     * 设置方向
     *
     * @param direction 方向
     */
    public void setDirection(Boolean direction) {
        this.direction = direction;
    }

    /**
     * 获取途径站台
     *
     * @return stations - 途径站台
     */
    public String getStations() {
        return stations;
    }

    /**
     * 设置途径站台
     *
     * @param stations 途径站台
     */
    public void setStations(String stations) {
        this.stations = stations;
    }

    /**
     * 获取当前站台
     *
     * @return current_station - 当前站台
     */
    public String getCurrentStation() {
        return currentStation;
    }

    /**
     * 设置当前站台
     *
     * @param currentStation 当前站台
     */
    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
    }

    /**
     * 获取最大负载
     *
     * @return max_load - 最大负载
     */
    public Integer getMaxLoad() {
        return maxLoad;
    }

    /**
     * 设置最大负载
     *
     * @param maxLoad 最大负载
     */
    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    /**
     * 获取当前负载
     *
     * @return cur_load - 当前负载
     */
    public Integer getCurLoad() {
        return curLoad;
    }

    /**
     * 设置当前负载
     *
     * @param curLoad 当前负载
     */
    public void setCurLoad(Integer curLoad) {
        this.curLoad = curLoad;
    }

    /**
     * 获取首班车时间
     *
     * @return first - 首班车时间
     */
    public String getFirst() {
        return first;
    }

    /**
     * 设置首班车时间
     *
     * @param first 首班车时间
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * 获取末班车时间
     *
     * @return last - 末班车时间
     */
    public String getLast() {
        return last;
    }

    /**
     * 设置末班车时间
     *
     * @param last 末班车时间
     */
    public void setLast(String last) {
        this.last = last;
    }
}