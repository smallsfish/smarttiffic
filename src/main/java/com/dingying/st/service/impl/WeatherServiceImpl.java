package com.dingying.st.service.impl;

import com.dingying.st.base.BaseDao;
import com.dingying.st.base.BaseServiceImpl;
import com.dingying.st.dao.WeatherMapper;
import com.dingying.st.po.Weather;
import com.dingying.st.service.WeatherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("weatherService")
public class WeatherServiceImpl extends BaseServiceImpl<Weather> implements WeatherService {
    @Resource
    private WeatherMapper weatherMapper;
    @Override
    public BaseDao<Weather> getMapper() {
        return weatherMapper;
    }
}
