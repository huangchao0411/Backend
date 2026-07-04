package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.ServiceEntity;

import java.util.List;

public interface ServiceService extends IService<ServiceEntity> {
    List<ServiceEntity> service();

    ServiceEntity getServiceById(Integer var1);

    void addService(ServiceEntity var1);

    void updateService(ServiceEntity var1);

    void deleteService(Integer var1);
}
