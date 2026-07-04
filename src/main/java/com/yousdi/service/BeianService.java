package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.BeianEntity;

public interface BeianService extends IService<BeianEntity> {
    BeianEntity getBeian();

    void updateBeian(BeianEntity var1);
}
