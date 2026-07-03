package com.yousdi.controller;

import com.yousdi.entity.Log;
import com.yousdi.entity.Result;
import com.yousdi.service.LogService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping({"/log"})
public class LogController {
    private static final Logger log = LoggerFactory.getLogger(LogController.class);
    @Autowired
    private LogService logService;

    @PostMapping
    public Result insertLog(@RequestBody Log loginfo) {
        try {
            log.info("日志信息： {}", loginfo);
            this.logService.insertLog(loginfo);
            return Result.success();
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }

    @GetMapping
    public Result logList(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo, @RequestParam(value = "pageSize",defaultValue = "15") int pageSize) {
        try {
            log.info("页码：{}, 尺寸：{}", pageNo, pageSize);
            List<Log> logs = this.logService.logList(pageNo, pageSize);
            return Result.success(logs);
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }

    @GetMapping({"/total"})
    public Result logTotal() {
        try {
            Integer total = this.logService.logTotal();
            return Result.success(total);
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }
}
