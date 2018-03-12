package com.dingying.st.service.impl;

import com.dingying.st.base.BaseDao;
import com.dingying.st.base.BaseServiceImpl;
import com.dingying.st.dao.BusMapper;
import com.dingying.st.po.Bus;
import com.dingying.st.service.BusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("busService")
public class BusServiceImpl extends BaseServiceImpl<Bus> implements BusService {
    @Resource
    private BusMapper busMapper;
    @Override
    public BaseDao<Bus> getMapper() {
        return busMapper;
    }
}
