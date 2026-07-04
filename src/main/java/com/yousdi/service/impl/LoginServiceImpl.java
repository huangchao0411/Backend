package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.UserEntity;
import com.yousdi.mapper.LoginMapper;
import com.yousdi.service.LoginService;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class LoginServiceImpl extends ServiceImpl<LoginMapper, UserEntity> implements LoginService {

    public UserEntity login(String username, String password) {
        return baseMapper.login(username, password);
    }
}
