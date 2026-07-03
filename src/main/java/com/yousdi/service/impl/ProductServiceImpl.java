package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.mapper.ProductMapper;
import com.yousdi.entity.PageBean;
import com.yousdi.entity.Product;
import com.yousdi.service.ProductService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    public PageBean productList(Integer pageNo, Integer pageSize, Integer categoryID, Integer isHot, String keyword) {
        PageHelper.startPage(pageNo, pageSize);
        List<Product> products = this.productMapper.productList(categoryID, isHot, keyword);
        Page<Product> pageBean = (Page)products;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public Product productById(Integer id) {
        return this.productMapper.productById(id);
    }

    public Integer addProduct(Product product) {
        product.setAddTime(LocalDateTime.now());
        product.setUpdateTime(LocalDateTime.now());
        this.productMapper.addProduct(product);
        return product.getId();
    }

    public void updateProduct(Product product) {
        product.setUpdateTime(LocalDateTime.now());
        this.productMapper.updateProduct(product);
    }

    public void deleteProduct(List<Integer> ids) {
        this.productMapper.delProduct(ids);
    }

    public Integer productByHot() {
        return this.productMapper.productByHot();
    }
}
