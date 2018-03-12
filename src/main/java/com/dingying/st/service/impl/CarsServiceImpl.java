package com.dingying.st.service.impl;

import com.dingying.st.base.BaseDao;
import com.dingying.st.base.BaseServiceImpl;
import com.dingying.st.dao.CarsMapper;
import com.dingying.st.po.Cars;
import com.dingying.st.service.CarsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("carsService")
public class CarsServiceImpl extends BaseServiceImpl<Cars> implements CarsService {
    @Resource
    private CarsMapper carsMapper;
    @Override
    public BaseDao<Cars> getMapper() {
        return carsMapper;
    }
}
