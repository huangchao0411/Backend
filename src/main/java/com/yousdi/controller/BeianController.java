package com.yousdi.controller;

import com.yousdi.entity.BeianEntity;
import com.yousdi.entity.Result;
import com.yousdi.service.BeianService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping({"/beian"})
public class BeianController {
    private static final Logger log = LoggerFactory.getLogger(BeianController.class);
    @Autowired
    private BeianService beianService;

    @GetMapping
    public Result getBeian() {
        log.info("getBeian");

        try {
            BeianEntity beian = this.beianService.getBeian();
            return Result.success(beian);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateBeian(@RequestBody BeianEntity beian) {
        log.info("updateBeian：{}", beian);

        try {
            this.beianService.updateBeian(beian);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }
}
