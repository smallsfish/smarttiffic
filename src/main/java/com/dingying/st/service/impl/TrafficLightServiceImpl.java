package com.dingying.st.service.impl;

import com.dingying.st.base.BaseDao;
import com.dingying.st.base.BaseServiceImpl;
import com.dingying.st.dao.TrafficLightMapper;
import com.dingying.st.po.TrafficLight;
import com.dingying.st.service.TrafficLightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("trafficLightService")
public class TrafficLightServiceImpl extends BaseServiceImpl<TrafficLight> implements TrafficLightService {
    @Resource
    private TrafficLightMapper trafficLightMapper;
    @Override
    public BaseDao<TrafficLight> getMapper() {
        return trafficLightMapper;
    }
}
