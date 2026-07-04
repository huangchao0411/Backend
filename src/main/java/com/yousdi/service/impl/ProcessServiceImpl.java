package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.ProcessEntity;
import com.yousdi.mapper.ProcessMapper;
import com.yousdi.service.ProcessService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ProcessServiceImpl extends ServiceImpl<ProcessMapper, ProcessEntity> implements ProcessService {

    public List<ProcessEntity> process() {
        return baseMapper.process();
    }

    public ProcessEntity getProcessById(Integer id) {
        return baseMapper.getProcessByID(id);
    }

    public void addProcess(ProcessEntity p) {
        p.setAddTime(LocalDateTime.now());
        p.setUpdateTime(LocalDateTime.now());
        baseMapper.addProcess(p);
    }

    public void updateProcess(ProcessEntity p) {
        p.setUpdateTime(LocalDateTime.now());
        baseMapper.updateProcess(p);
    }

    public void deleteProcess(Integer id) {
        baseMapper.delProcess(id);
    }
}
