package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.ProcessEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProcessMapper extends BaseMapper<ProcessEntity> {

    List<ProcessEntity> process();

    ProcessEntity getProcessByID(Integer var1);

    void addProcess(ProcessEntity var1);

    void updateProcess(ProcessEntity var1);

    void delProcess(Integer var1);

}
