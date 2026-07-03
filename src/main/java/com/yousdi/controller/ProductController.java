package com.yousdi.controller;

import com.yousdi.entity.PageBean;
import com.yousdi.entity.Product;
import com.yousdi.entity.Result;
import com.yousdi.service.ProductService;
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
@RequestMapping({"/product"})
public class ProductController {
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductService productService;

    @GetMapping
    public Result productList(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo, @RequestParam(value = "pageSize",defaultValue = "14") Integer pageSize, @RequestParam(value = "categoryID",required = false) Integer categoryID, @RequestParam(value = "isHot",required = false) Integer isHot, @RequestParam(required = false) String keyword) {
        log.info("查询所有产品：{}，{}，{}，{}", new Object[]{pageNo, pageSize, categoryID, isHot});

        try {
            PageBean pageBean = this.productService.productList(pageNo, pageSize, categoryID, isHot, keyword);
            return Result.success(pageBean);
        } catch (Exception ex) {
            return Result.error(ex.getMessage());
        }
    }

    @GetMapping({"/{id}"})
    public Result productById(@PathVariable Integer id) {
        log.info("查询产品id：{}", id);

        try {
            Product product = this.productService.productById(id);
            return Result.success(product);
        } catch (Exception ex) {
            return Result.error(ex.getMessage());
        }
    }

    @PostMapping
    public Result addProduct(@RequestBody Product product) {
        log.info("添加产品：{}", product);

        try {
            Integer id = this.productService.addProduct(product);
            return Result.success(id);
        } catch (Exception ex) {
            return Result.error("添加失败：" + ex.getMessage());
        }
    }

    @PutMapping
    public Result updateProduct(@RequestBody Product product) {
        log.info("修改产品：{}", product);

        try {
            this.productService.updateProduct(product);
            return Result.success("修改成功");
        } catch (Exception ex) {
            return Result.error("修改失败：" + ex.getMessage());
        }
    }

    @DeleteMapping
    public Result deleteProduct(@RequestBody List<Integer> ids) {
        log.info("删除产品id：{}", ids);

        try {
            this.productService.deleteProduct(ids);
            return Result.success("删除成功");
        } catch (Exception ex) {
            return Result.error("删除失败：" + ex.getMessage());
        }
    }

    @GetMapping({"/hot"})
    public Result productByHot() {
        log.info("查询最热产品");

        try {
            Integer hots = this.productService.productByHot();
            return Result.success(hots);
        } catch (Exception ex) {
            return Result.error(ex.getMessage());
        }
    }
}
