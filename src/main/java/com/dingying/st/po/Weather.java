package com.dingying.st.po;

import java.util.Date;

public class Weather {
    private String id;

    //温度范围
    private String temperatureRange;

    //当前温度
    private Integer currentTemperature;

    //湿度
    private String humidity;

    //PM2.5浓度
    private String pm25;

    //风力
    private String wind;

    //天气状况
    private String weatherStatus;

    //紫外线强度
    private Integer ultraviolet;

    //二氧化碳浓度
    private Integer co2;

    //当前时间，5分钟刷新一次
    private Date currentTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取温度范围
     *
     * @return temperature_range - 温度范围
     */
    public String getTemperatureRange() {
        return temperatureRange;
    }

    /**
     * 设置温度范围
     *
     * @param temperatureRange 温度范围
     */
    public void setTemperatureRange(String temperatureRange) {
        this.temperatureRange = temperatureRange;
    }

    /**
     * 获取当前温度
     *
     * @return current_temperature - 当前温度
     */
    public Integer getCurrentTemperature() {
        return currentTemperature;
    }

    /**
     * 设置当前温度
     *
     * @param currentTemperature 当前温度
     */
    public void setCurrentTemperature(Integer currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    /**
     * 获取湿度
     *
     * @return humidity - 湿度
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * 设置湿度
     *
     * @param humidity 湿度
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * 获取PM2.5浓度
     *
     * @return pm2_5 - PM2.5浓度
     */
    public String getPm25() {
        return pm25;
    }

    /**
     * 设置PM2.5浓度
     *
     * @param pm25 PM2.5浓度
     */
    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    /**
     * 获取风力
     *
     * @return wind - 风力
     */
    public String getWind() {
        return wind;
    }

    /**
     * 设置风力
     *
     * @param wind 风力
     */
    public void setWind(String wind) {
        this.wind = wind;
    }

    /**
     * 获取天气状况
     *
     * @return weather_status - 天气状况
     */
    public String getWeatherStatus() {
        return weatherStatus;
    }

    /**
     * 设置天气状况
     *
     * @param weatherStatus 天气状况
     */
    public void setWeatherStatus(String weatherStatus) {
        this.weatherStatus = weatherStatus;
    }

    /**
     * 获取紫外线强度
     *
     * @return ultraviolet - 紫外线强度
     */
    public Integer getUltraviolet() {
        return ultraviolet;
    }

    /**
     * 设置紫外线强度
     *
     * @param ultraviolet 紫外线强度
     */
    public void setUltraviolet(Integer ultraviolet) {
        this.ultraviolet = ultraviolet;
    }

    /**
     * 获取二氧化碳浓度
     *
     * @return CO2 - 二氧化碳浓度
     */
    public Integer getCo2() {
        return co2;
    }

    /**
     * 设置二氧化碳浓度
     *
     * @param co2 二氧化碳浓度
     */
    public void setCo2(Integer co2) {
        this.co2 = co2;
    }

    /**
     * 获取当前时间，5分钟刷新一次
     *
     * @return current_time - 当前时间，5分钟刷新一次
     */
    public Date getCurrentTime() {
        return currentTime;
    }

    /**
     * 设置当前时间，5分钟刷新一次
     *
     * @param currentTime 当前时间，5分钟刷新一次
     */
    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}