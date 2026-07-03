package com.yousdi.service;

import com.yousdi.entity.Log;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogService {
    void insertLog(Log var1);

    List<Log> logList(@Param("pageNo") int var1, @Param("pageSize") int var2);

    Integer logTotal();
}
