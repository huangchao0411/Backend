package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.ProcessEntity;

import java.util.List;

public interface ProcessService extends IService<ProcessEntity> {
    List<ProcessEntity> process();

    ProcessEntity getProcessById(Integer var1);

    void addProcess(ProcessEntity var1);

    void updateProcess(ProcessEntity var1);

    void deleteProcess(Integer var1);
}
