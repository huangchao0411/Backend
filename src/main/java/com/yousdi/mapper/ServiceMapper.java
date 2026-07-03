package com.yousdi.mapper;

import com.yousdi.entity.Service;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServiceMapper {
    List<Service> service();

    Service getServiceById(Integer var1);

    void addService(Service var1);

    void updateService(Service var1);

    void deleteService(Integer var1);
}
