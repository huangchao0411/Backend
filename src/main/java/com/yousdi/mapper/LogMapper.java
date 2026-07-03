package com.yousdi.mapper;

import com.yousdi.entity.Log;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogMapper {
    void insertLog(Log var1);

    List<Log> logList(@Param("pageSize") int var1, @Param("params1") int var2);

    Integer logTotal();
}
