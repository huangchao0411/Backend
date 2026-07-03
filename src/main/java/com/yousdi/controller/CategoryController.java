package com.yousdi.controller;

import com.yousdi.entity.CaseImg;
import com.yousdi.entity.Category;
import com.yousdi.entity.Result;
import com.yousdi.service.CategoryService;
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
@RequestMapping({"/category"})
public class CategoryController {
    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public Result categoryList(@RequestParam(required = false) Integer channelID, @RequestParam(required = false) Integer isHeader, @RequestParam(required = false) Integer isFooter, @RequestParam(required = false) Integer id) {
        log.info("categoryList");

        try {
            List<Category> categoryList = this.categoryService.categoryList(channelID, isHeader, isFooter, id);
            return Result.success(categoryList);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @GetMapping({"/imgs"})
    public Result getCategoryImgs(@RequestParam(required = false) Integer categoryID, @RequestParam(required = false) Integer id) {
        log.info("getCategoryImgs");

        try {
            List<CaseImg> caseImgList = this.categoryService.getCategoryImgs(categoryID, id);
            return Result.success(caseImgList);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @PutMapping({"/imgs"})
    public Result updateCategoryImgs(@RequestBody CaseImg caseImg) {
        log.info("updateCategoryImgs： {}", caseImg);

        try {
            this.categoryService.updateCategoryImgs(caseImg);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }

    @PostMapping({"/imgs"})
    public Result addCategoryImgs(@RequestBody CaseImg caseImg) {
        log.info("addCategoryImgs： {}", caseImg);

        try {
            this.categoryService.addCategoryImgs(caseImg);
            return Result.success("添加成功");
        } catch (Exception e) {
            return Result.error("添加失败：" + e.getMessage());
        }
    }

    @DeleteMapping({"/imgs"})
    public Result deleteCategoryImgs(@RequestBody List<Integer> ids) {
        log.info("deleteCategoryImgs： {}", ids);

        try {
            this.categoryService.deleteCategoryImgs(ids);
            return Result.success("删除成功");
        } catch (Exception e) {
            return Result.error("删除失败：" + e.getMessage());
        }
    }

    @PostMapping
    public Result addCategory(@RequestBody Category c) {
        log.info("addCategory： {}", c);

        try {
            this.categoryService.addCategory(c);
            return Result.success("添加成功");
        } catch (Exception e) {
            return Result.error("添加失败：" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateCategory(@RequestBody Category c) {
        log.info("updateCategory： {}", c);

        try {
            this.categoryService.updateCategory(c);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }

    @DeleteMapping({"/{id}"})
    public Result deleteCategory(@PathVariable Integer id) {
        log.info("deleteCategory： {}", id);

        try {
            this.categoryService.deleteCategory(id);
            return Result.success("删除成功");
        } catch (Exception e) {
            return Result.error("删除失败：" + e.getMessage());
        }
    }
}
