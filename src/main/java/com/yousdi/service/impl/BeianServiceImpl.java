package com.yousdi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.BeianEntity;
import com.yousdi.mapper.BeianMapper;
import com.yousdi.service.BeianService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BeianServiceImpl extends ServiceImpl<BeianMapper, BeianEntity> implements BeianService {

    public BeianEntity getBeian() {
        return baseMapper.getBeian();
    }

    public void updateBeian(BeianEntity beian) {
        beian.setUpdateTime(LocalDateTime.now());
        baseMapper.updateBeian(beian);
    }
}
