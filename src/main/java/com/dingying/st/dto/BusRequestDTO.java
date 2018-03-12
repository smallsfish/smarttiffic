package com.dingying.st.dto;

public class BusRequestDTO {
    private Integer busRoute;
    private Integer busNumber;
    private Integer stationNumber;

    public Integer getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(Integer busRoute) {
        this.busRoute = busRoute;
    }

    public Integer getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Integer busNumber) {
        this.busNumber = busNumber;
    }

    public Integer getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(Integer stationNumber) {
        this.stationNumber = stationNumber;
    }
}
