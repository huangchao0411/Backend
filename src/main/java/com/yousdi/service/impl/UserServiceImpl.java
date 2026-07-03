package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.entity.UserEntity;
import com.yousdi.mapper.UserMapper;
import com.yousdi.entity.PageBean;
import com.yousdi.entity.Password;
import com.yousdi.service.UserService;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void addUser(UserEntity u) {
        u.setAddTime(LocalDateTime.now());
        u.setUpdateTime(LocalDateTime.now());
        this.userMapper.addUser(u);
    }

    public void modifyUser(UserEntity u) {
        u.setUpdateTime(LocalDateTime.now());
        this.userMapper.modifyUser(u);
    }

    public UserEntity getUser(@Param("username") String username, @Param("password") String password) {
        return this.userMapper.getUser(username, password);
    }

    public PageBean getAllUser(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<UserEntity> userEntities = this.userMapper.getAllUser();
        Page<UserEntity> pageBean = (Page) userEntities;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public UserEntity getUserById(Integer id) {
        return this.userMapper.getUserById(id);
    }

    public void deleteUser(Integer id, Integer isLock) {
        this.userMapper.delUser(id, isLock);
    }

    public void modifyUserPsd(Password psd) {
        this.userMapper.modifyUserPsd(psd);
    }
}
