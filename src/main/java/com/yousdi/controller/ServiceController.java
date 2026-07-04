package com.yousdi.controller;

import com.yousdi.entity.ServiceEntity;
import com.yousdi.utils.Result;
import com.yousdi.service.ServiceService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping({"/service"})
public class ServiceController {
    private static final Logger log = LoggerFactory.getLogger(ServiceController.class);
    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public Result service() {
        log.info("service");

        try {
            List<ServiceEntity> serviceEntities = this.serviceService.service();
            return Result.success(serviceEntities);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @GetMapping({"/{id}"})
    public Result getServiceById(@RequestParam Integer id) {
        log.info("getServiceById： {}", id);

        try {
            ServiceEntity serviceEntity = this.serviceService.getServiceById(id);
            return Result.success(serviceEntity);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @PostMapping
    public Result addService(@RequestBody ServiceEntity s) {
        log.info("addService： {}", s);

        try {
            this.serviceService.addService(s);
            return Result.success("添加成功");
        } catch (Exception e) {
            return Result.error("添加失败：" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateService(@RequestBody ServiceEntity s) {
        log.info("updateService： {}", s);

        try {
            this.serviceService.updateService(s);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }

    @DeleteMapping({"/{id}"})
    public Result deleteService(@PathVariable Integer id) {
        log.info("deleteService： {}", id);

        try {
            this.serviceService.deleteService(id);
            return Result.success("删除成功");
        } catch (Exception e) {
            return Result.error("删除失败：" + e.getMessage());
        }
    }
}
