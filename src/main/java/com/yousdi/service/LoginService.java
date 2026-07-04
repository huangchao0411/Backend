package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.UserEntity;

public interface LoginService extends IService<UserEntity> {
    UserEntity login(String var1, String var2);
}
