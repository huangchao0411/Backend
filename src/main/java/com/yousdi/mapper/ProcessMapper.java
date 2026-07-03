package com.yousdi.mapper;

import com.yousdi.entity.Process;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProcessMapper {
    List<Process> process();

    Process getProcessByID(Integer var1);

    void addProcess(Process var1);

    void updateProcess(Process var1);

    void delProcess(Integer var1);
}
