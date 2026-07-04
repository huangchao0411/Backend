package com.yousdi.controller;

import com.yousdi.entity.NewsEntity;
import com.yousdi.utils.PageBean;
import com.yousdi.utils.Result;
import com.yousdi.service.NewsService;
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
@RequestMapping({"/news"})
public class NewsController {
    private static final Logger log = LoggerFactory.getLogger(NewsController.class);
    @Autowired
    private NewsService newsService;

    @GetMapping
    public Result newsList(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo, @RequestParam(value = "pageSize",defaultValue = "15") Integer pageSize, @RequestParam(required = false) Integer categoryID, @RequestParam(required = false) Integer isHot, @RequestParam(required = false) String keyword) {
        log.info("news: {}", keyword);

        try {
            PageBean pageBean = this.newsService.newsList(pageNo, pageSize, categoryID, isHot, keyword);
            return Result.success(pageBean);
        } catch (Exception ex) {
            return Result.error("获取失败：" + ex.getMessage());
        }
    }

    @GetMapping({"/{id}"})
    public Result getNewsById(@PathVariable Integer id) {
        log.info("getNewsById： {}", id);

        try {
            NewsEntity newsEntityById = this.newsService.getNewsById(id);
            return Result.success(newsEntityById);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @PostMapping
    public Result addNews(@RequestBody NewsEntity n) {
        log.info("addNews： {}", n);

        try {
            this.newsService.addNews(n);
            return Result.success("添加成功");
        } catch (Exception e) {
            return Result.error("添加失败：" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateNews(@RequestBody NewsEntity n) {
        log.info("updateNews： {}", n);

        try {
            this.newsService.updateNews(n);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }

    @DeleteMapping
    public Result deleteNews(@RequestBody List<Integer> ids) {
        log.info("deleteNews： {}", ids);

        try {
            this.newsService.deleteNews(ids);
            return Result.success("删除成功");
        } catch (Exception e) {
            return Result.error("删除失败：" + e.getMessage());
        }
    }
}
