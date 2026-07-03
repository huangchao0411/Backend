package com.yousdi.service;

import com.yousdi.entity.Service;
import java.util.List;

public interface ServiceService {
    List<Service> service();

    Service getServiceById(Integer var1);

    void addService(Service var1);

    void updateService(Service var1);

    void deleteService(Integer var1);
}
