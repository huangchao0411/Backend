package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.mapper.LogMapper;
import com.yousdi.entity.Log;
import com.yousdi.service.LogService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;

    public void insertLog(Log log) {
        log.setAddTime(LocalDateTime.now());
        this.logMapper.insertLog(log);
    }

    public List<Log> logList(int pageNo, int pageSize) {
        int params1 = (pageNo - 1) * pageSize;
        return this.logMapper.logList(pageSize, params1);
    }

    public Integer logTotal() {
        return this.logMapper.logTotal();
    }
}
