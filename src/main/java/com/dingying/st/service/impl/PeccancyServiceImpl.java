package com.dingying.st.service.impl;

import com.dingying.st.base.BaseDao;
import com.dingying.st.base.BaseServiceImpl;
import com.dingying.st.dao.PeccancyMapper;
import com.dingying.st.po.Peccancy;
import com.dingying.st.service.PeccancyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("peccancyService")
public class PeccancyServiceImpl extends BaseServiceImpl<Peccancy> implements PeccancyService {
    @Resource
    private PeccancyMapper peccancyMapper;
    @Override
    public BaseDao<Peccancy> getMapper() {
        return peccancyMapper;
    }
}
