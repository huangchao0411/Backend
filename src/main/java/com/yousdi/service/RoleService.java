package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.RoleEntity;
import java.util.List;

public interface RoleService extends IService<RoleEntity> {
    List<RoleEntity> getAllRole();
}
