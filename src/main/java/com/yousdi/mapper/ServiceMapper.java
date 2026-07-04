package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.ServiceEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServiceMapper extends BaseMapper<ServiceEntity> {
    List<ServiceEntity> service();

    ServiceEntity getServiceById(Integer var1);

    void addService(ServiceEntity var1);

    void updateService(ServiceEntity var1);

    void deleteService(Integer var1);
}
