package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.PasswordEntity;
import com.yousdi.entity.UserEntity;
import com.yousdi.utils.PageBean;

public interface UserService extends IService<UserEntity> {
    void addUser(UserEntity var1);

    void modifyUser(UserEntity var1);

    UserEntity getUser(String var1, String var2);

    PageBean getAllUser(int var1, int var2);

    UserEntity getUserById(Integer var1);

    void deleteUser(Integer var1, Integer var2);

    void modifyUserPsd(PasswordEntity var1);
}
