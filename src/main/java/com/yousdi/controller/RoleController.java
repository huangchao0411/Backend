package com.yousdi.controller;

import com.yousdi.utils.Result;
import com.yousdi.entity.RoleEntity;
import com.yousdi.service.RoleService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping({"/role"})
public class RoleController {
    private static final Logger log = LoggerFactory.getLogger(RoleController.class);
    @Autowired
    private RoleService roleService;

    @GetMapping
    public Result getAllRole() {
        log.info("getAllRole");

        try {
            List<RoleEntity> roleEntities = this.roleService.getAllRole();
            return Result.success(roleEntities);
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }
}
