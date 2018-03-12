package com.dingying.st.dto;

public class BusDTO {
    private String busName;
    private String stationName;
    private Integer busNumber;
    private Integer cur_load;
    private Integer distance;

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Integer busNumber) {
        this.busNumber = busNumber;
    }

    public Integer getCur_load() {
        return cur_load;
    }

    public void setCur_load(Integer cur_load) {
        this.cur_load = cur_load;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
