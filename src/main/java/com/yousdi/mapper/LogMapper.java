package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.LogEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogMapper extends BaseMapper<LogEntity> {

    void insertLog(LogEntity var1);

    List<LogEntity> logList(@Param("pageSize") int var1, @Param("params1") int var2);

    Integer logTotal();

}
