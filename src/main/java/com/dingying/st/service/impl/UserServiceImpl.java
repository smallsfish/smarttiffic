package com.dingying.st.service.impl;

import com.dingying.st.base.BaseDao;
import com.dingying.st.base.BaseServiceImpl;
import com.dingying.st.dao.UserMapper;
import com.dingying.st.po.User;
import com.dingying.st.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public BaseDao<User> getMapper() {
        return userMapper;
    }
}
