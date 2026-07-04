package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.entity.UserEntity;
import com.yousdi.mapper.UserMapper;
import com.yousdi.utils.PageBean;
import com.yousdi.entity.PasswordEntity;
import com.yousdi.service.UserService;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    public void addUser(UserEntity u) {
        u.setAddTime(LocalDateTime.now());
        u.setUpdateTime(LocalDateTime.now());
        baseMapper.addUser(u);
    }

    public void modifyUser(UserEntity u) {
        u.setUpdateTime(LocalDateTime.now());
        baseMapper.modifyUser(u);
    }

    public UserEntity getUser(@Param("username") String username, @Param("password") String password) {
        return baseMapper.getUser(username, password);
    }

    public PageBean getAllUser(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<UserEntity> userEntities = baseMapper.getAllUser();
        Page<UserEntity> pageBean = (Page) userEntities;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public UserEntity getUserById(Integer id) {
        return baseMapper.getUserById(id);
    }

    public void deleteUser(Integer id, Integer isLock) {
        baseMapper.delUser(id, isLock);
    }

    public void modifyUserPsd(PasswordEntity psd) {
        baseMapper.modifyUserPsd(psd);
    }
}
