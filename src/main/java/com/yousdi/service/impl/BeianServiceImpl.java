package com.yousdi.service.impl;

import com.yousdi.mapper.BeianMapper;
import com.yousdi.entity.BeianEntity;
import com.yousdi.service.BeianService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeianServiceImpl implements BeianService {
    @Autowired
    private BeianMapper beianMapper;

    public BeianEntity getBeian() {
        return this.beianMapper.getBeian();
    }

    public void updateBeian(BeianEntity beian) {
        beian.setUpdateTime(LocalDateTime.now());
        this.beianMapper.updateBeian(beian);
    }
}
