package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.LogEntity;
import com.yousdi.mapper.LogMapper;
import com.yousdi.service.LogService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class LogServiceImpl extends ServiceImpl<LogMapper, LogEntity> implements LogService {

    public void insertLog(LogEntity logEntity) {
        logEntity.setAddTime(LocalDateTime.now());
        baseMapper.insertLog(logEntity);
    }

    public List<LogEntity> logList(int pageNo, int pageSize) {
        int params1 = (pageNo - 1) * pageSize;
        return baseMapper.logList(pageSize, params1);
    }

    public Integer logTotal() {
        return baseMapper.logTotal();
    }
}
