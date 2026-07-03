package com.yousdi.service;

import com.yousdi.entity.PageBean;
import com.yousdi.entity.Password;
import com.yousdi.entity.UserEntity;

public interface UserService {
    void addUser(UserEntity var1);

    void modifyUser(UserEntity var1);

    UserEntity getUser(String var1, String var2);

    PageBean getAllUser(int var1, int var2);

    UserEntity getUserById(Integer var1);

    void deleteUser(Integer var1, Integer var2);

    void modifyUserPsd(Password var1);
}
