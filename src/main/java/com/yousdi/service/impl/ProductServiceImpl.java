package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.entity.ProductEntity;
import com.yousdi.mapper.ProductMapper;
import com.yousdi.utils.PageBean;
import com.yousdi.service.ProductService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, ProductEntity> implements ProductService {
    
    public PageBean productList(Integer pageNo, Integer pageSize, Integer categoryID, Integer isHot, String keyword) {
        PageHelper.startPage(pageNo, pageSize);
        List<ProductEntity> productEntities = baseMapper.productList(categoryID, isHot, keyword);
        Page<ProductEntity> pageBean = (Page) productEntities;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public ProductEntity productById(Integer id) {
        return baseMapper.productById(id);
    }

    public Integer addProduct(ProductEntity productEntity) {
        productEntity.setAddTime(LocalDateTime.now());
        productEntity.setUpdateTime(LocalDateTime.now());
        baseMapper.addProduct(productEntity);
        return productEntity.getId();
    }

    public void updateProduct(ProductEntity productEntity) {
        productEntity.setUpdateTime(LocalDateTime.now());
        baseMapper.updateProduct(productEntity);
    }

    public void deleteProduct(List<Integer> ids) {
        baseMapper.delProduct(ids);
    }

    public Integer productByHot() {
        return baseMapper.productByHot();
    }
}
