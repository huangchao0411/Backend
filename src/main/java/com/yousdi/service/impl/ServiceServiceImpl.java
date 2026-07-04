package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.ServiceEntity;
import com.yousdi.mapper.ServiceMapper;
import com.yousdi.service.ServiceService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ServiceServiceImpl extends ServiceImpl<ServiceMapper, ServiceEntity> implements ServiceService {

    public List<ServiceEntity> service() {
        return baseMapper.service();
    }

    public ServiceEntity getServiceById(Integer id) {
        return baseMapper.getServiceById(id);
    }

    public void addService(ServiceEntity s) {
        s.setAddTime(LocalDateTime.now());
        s.setUpdateTime(LocalDateTime.now());
        baseMapper.addService(s);
    }

    public void updateService(ServiceEntity s) {
        s.setUpdateTime(LocalDateTime.now());
        baseMapper.updateService(s);
    }

    public void deleteService(Integer id) {
        baseMapper.deleteService(id);
    }
}
