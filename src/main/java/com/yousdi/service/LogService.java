package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.LogEntity;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LogService extends IService<LogEntity> {
    void insertLog(LogEntity var1);

    List<LogEntity> logList(@Param("pageNo") int var1, @Param("pageSize") int var2);

    Integer logTotal();
}
