package com.yousdi.mapper;

import com.yousdi.entity.Password;
import com.yousdi.entity.UserEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    void addUser(UserEntity var1);

    void modifyUser(UserEntity var1);

    UserEntity getUser(String var1, String var2);

    List<UserEntity> getAllUser();

    UserEntity getUserById(Integer var1);

    void delUser(@Param("id") Integer var1, @Param("isLock") Integer var2);

    void modifyUserPsd(Password var1);
}
