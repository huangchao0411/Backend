package com.yousdi.controller;

import com.yousdi.entity.Proimg;
import com.yousdi.entity.Result;
import com.yousdi.service.ProimgService;
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
@RequestMapping({"/proimg"})
public class ProimgController {
    private static final Logger log = LoggerFactory.getLogger(ProimgController.class);
    @Autowired
    private ProimgService proimgService;

    @GetMapping
    public Result proimgList(@RequestParam Integer pid) {
        log.info("查询所有图片");

        try {
            List<Proimg> proimgs = this.proimgService.proimgList(pid);
            return Result.success(proimgs);
        } catch (Exception ex) {
            return Result.error(ex.getMessage());
        }
    }

    @GetMapping({"/{id}"})
    public Result proimgById(@PathVariable Integer id) {
        log.info("查询图片id：{}", id);

        try {
            Proimg proimg = this.proimgService.proimgById(id);
            return Result.success(proimg);
        } catch (Exception ex) {
            return Result.error(ex.getMessage());
        }
    }

    @PostMapping
    public Result addProimg(@RequestBody List<Proimg> proimgs) {
        log.info("添加图片：{}", proimgs);

        try {
            this.proimgService.addProimg(proimgs);
            return Result.success("添加成功！");
        } catch (Exception ex) {
            return Result.error("添加失败：" + ex.getMessage());
        }
    }

    @PutMapping
    public Result updateProimg(@RequestBody Proimg proimg) {
        log.info("修改图片：{}", proimg);

        try {
            this.proimgService.updateProimg(proimg);
            return Result.success();
        } catch (Exception ex) {
            return Result.error(ex.getMessage());
        }
    }

    @DeleteMapping
    public Result deleteProimg(@RequestBody List<Integer> ids) {
        log.info("删除图片id：{}", ids);

        try {
            this.proimgService.deleteProimg(ids);
            return Result.success();
        } catch (Exception ex) {
            return Result.error(ex.getMessage());
        }
    }
}
