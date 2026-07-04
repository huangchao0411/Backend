package com.yousdi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.mapper.RoleMapper;
import com.yousdi.entity.RoleEntity;
import com.yousdi.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements RoleService {
    
    public List<RoleEntity> getAllRole() {
        return baseMapper.getAllRole();
    }
}
