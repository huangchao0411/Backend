package com.yousdi.controller;

import com.yousdi.entity.Process;
import com.yousdi.entity.Result;
import com.yousdi.service.ProcessService;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping({"/process"})
public class ProcessController {
    private static final Logger log = LoggerFactory.getLogger(ProcessController.class);
    @Autowired
    private ProcessService processService;

    @GetMapping
    public Result process() {
        log.info("process");

        try {
            List<Process> processList = this.processService.process();
            return Result.success(processList);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @GetMapping({"/{id}"})
    public Result getProcessById(@PathVariable Integer id) {
        log.info("getProcessById： {}", id);

        try {
            Process process = this.processService.getProcessById(id);
            return Result.success(process);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @PostMapping
    public Result addProcess(@RequestBody Process p) {
        log.info("addProcess： {}", p);

        try {
            this.processService.addProcess(p);
            return Result.success("添加成功");
        } catch (Exception e) {
            return Result.error("添加失败：" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateProcess(@RequestBody Process p) {
        log.info("updateProcess： {}", p);

        try {
            this.processService.updateProcess(p);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }

    @DeleteMapping({"/{id}"})
    public Result deleteProcess(@PathVariable Integer id) {
        log.info("deleteProcess： {}", id);

        try {
            this.processService.deleteProcess(id);
            return Result.success("删除成功");
        } catch (Exception e) {
            return Result.error("删除失败：" + e.getMessage());
        }
    }
}
