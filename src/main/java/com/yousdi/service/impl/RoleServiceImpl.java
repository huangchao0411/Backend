package com.yousdi.service.impl;

import com.yousdi.mapper.RoleMapper;
import com.yousdi.entity.Role;
import com.yousdi.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    public List<Role> getAllRole() {
        return this.roleMapper.getAllRole();
    }
}
