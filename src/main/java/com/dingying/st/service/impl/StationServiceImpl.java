package com.dingying.st.service.impl;

import com.dingying.st.base.BaseDao;
import com.dingying.st.base.BaseServiceImpl;
import com.dingying.st.dao.StationMapper;
import com.dingying.st.po.Station;
import com.dingying.st.service.StationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("stationService")
public class StationServiceImpl extends BaseServiceImpl<Station> implements StationService {
    @Resource
    private StationMapper stationMapper;
    @Override
    public BaseDao<Station> getMapper() {
        return stationMapper;
    }
}
