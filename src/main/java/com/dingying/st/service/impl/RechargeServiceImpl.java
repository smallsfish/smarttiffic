package com.dingying.st.service.impl;

import com.dingying.st.base.BaseDao;
import com.dingying.st.base.BaseServiceImpl;
import com.dingying.st.dao.RechargeMapper;
import com.dingying.st.po.Recharge;
import com.dingying.st.service.RechargeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("rechargeService")
public class RechargeServiceImpl extends BaseServiceImpl<Recharge> implements RechargeService {
    @Resource
    private RechargeMapper rechargeMapper;
    @Override
    public BaseDao<Recharge> getMapper() {
        return rechargeMapper;
    }
}
