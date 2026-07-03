package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.mapper.ProcessMapper;
import com.yousdi.entity.Process;
import com.yousdi.service.ProcessService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ProcessServiceImpl implements ProcessService {
    @Autowired
    private ProcessMapper processMapper;

    public List<Process> process() {
        return this.processMapper.process();
    }

    public Process getProcessById(Integer id) {
        return this.processMapper.getProcessByID(id);
    }

    public void addProcess(Process p) {
        p.setAddTime(LocalDateTime.now());
        p.setUpdateTime(LocalDateTime.now());
        this.processMapper.addProcess(p);
    }

    public void updateProcess(Process p) {
        p.setUpdateTime(LocalDateTime.now());
        this.processMapper.updateProcess(p);
    }

    public void deleteProcess(Integer id) {
        this.processMapper.delProcess(id);
    }
}
