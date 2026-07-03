package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.entity.UserEntity;
import com.yousdi.mapper.LoginMapper;
import com.yousdi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    public UserEntity login(String username, String password) {
        return this.loginMapper.login(username, password);
    }
}
