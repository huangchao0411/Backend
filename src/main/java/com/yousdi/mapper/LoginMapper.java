package com.yousdi.mapper;

import com.yousdi.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select({"select id, username, password, roleID, name, isLock from manager where username=#{username} and password = #{password} and isLock = 1"})
    UserEntity login(@Param("username") String var1, @Param("password") String var2);
}
