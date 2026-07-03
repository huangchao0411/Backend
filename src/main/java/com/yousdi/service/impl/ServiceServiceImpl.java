package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.mapper.ServiceMapper;
import com.yousdi.service.ServiceService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private ServiceMapper serviceMapper;

    public List<com.yousdi.entity.Service> service() {
        return this.serviceMapper.service();
    }

    public com.yousdi.entity.Service getServiceById(Integer id) {
        return this.serviceMapper.getServiceById(id);
    }

    public void addService(com.yousdi.entity.Service s) {
        s.setAddTime(LocalDateTime.now());
        s.setUpdateTime(LocalDateTime.now());
        this.serviceMapper.addService(s);
    }

    public void updateService(com.yousdi.entity.Service s) {
        s.setUpdateTime(LocalDateTime.now());
        this.serviceMapper.updateService(s);
    }

    public void deleteService(Integer id) {
        this.serviceMapper.deleteService(id);
    }
}
