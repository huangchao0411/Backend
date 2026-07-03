package com.yousdi.controller;

import com.yousdi.entity.Case;
import com.yousdi.entity.PageBean;
import com.yousdi.entity.Result;
import com.yousdi.service.CaseService;
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
@RequestMapping({"/case"})
public class CaseController {
    private static final Logger log = LoggerFactory.getLogger(CaseController.class);
    @Autowired
    private CaseService caseService;

    @GetMapping
    public Result caseList(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo, @RequestParam(value = "pageSize",defaultValue = "15") Integer pageSize, @RequestParam(required = false) Integer categoryID, @RequestParam(required = false) String keyword) {
        log.info("caseList:{}", keyword);

        try {
            PageBean pageBean = this.caseService.caseList(pageNo, pageSize, categoryID, keyword);
            return Result.success(pageBean);
        } catch (Exception e) {
            return Result.error("获取失败:" + e.getMessage());
        }
    }

    @GetMapping({"/{id}"})
    public Result getCaseById(@PathVariable Integer id) {
        log.info("getCaseById： {}", id);

        try {
            Case caseById = this.caseService.getCaseById(id);
            return Result.success(caseById);
        } catch (Exception e) {
            return Result.error("获取失败:" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateCase(@RequestBody Case c) {
        log.info("updateCase： {}", c);

        try {
            this.caseService.updateCase(c);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }

    @PostMapping
    public Result addCase(@RequestBody Case c) {
        log.info("addCase： {}", c);

        try {
            this.caseService.addCase(c);
            return Result.success("添加成功");
        } catch (Exception e) {
            return Result.error("添加失败：" + e.getMessage());
        }
    }

    @DeleteMapping
    public Result deleteCase(@RequestBody List<Integer> ids) {
        log.info("deleteCase： {}", ids);

        try {
            this.caseService.deleteCase(ids);
            return Result.success("删除成功");
        } catch (Exception e) {
            return Result.error("删除失败：" + e.getMessage());
        }
    }
}
