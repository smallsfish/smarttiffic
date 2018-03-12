package com.dingying.st.service.impl;

import com.dingying.st.base.BaseDao;
import com.dingying.st.base.BaseServiceImpl;
import com.dingying.st.dao.RoadMapper;
import com.dingying.st.po.Road;
import com.dingying.st.service.RoadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("roadService")
public class RoadServiceImpl extends BaseServiceImpl<Road> implements RoadService {
    @Resource
    private RoadMapper roadMapper;
    @Override
    public BaseDao<Road> getMapper() {
        return roadMapper;
    }
}
