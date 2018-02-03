package com.dingying.st.po;

public class Station {
    private Integer id;

    //站台名称
    private String stationName;

    //相邻站台，以站台序号逗号分隔
    private String abjoinStation;

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
     * 获取站台名称
     *
     * @return station_name - 站台名称
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 设置站台名称
     *
     * @param stationName 站台名称
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * 获取相邻站台，以站台序号逗号分隔
     *
     * @return abjoin_station - 相邻站台，以站台序号逗号分隔
     */
    public String getAbjoinStation() {
        return abjoinStation;
    }

    /**
     * 设置相邻站台，以站台序号逗号分隔
     *
     * @param abjoinStation 相邻站台，以站台序号逗号分隔
     */
    public void setAbjoinStation(String abjoinStation) {
        this.abjoinStation = abjoinStation;
    }
}