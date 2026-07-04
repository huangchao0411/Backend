package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.ProductEntity;
import com.yousdi.utils.PageBean;

import java.util.List;

public interface ProductService extends IService<ProductEntity> {
    PageBean productList(Integer var1, Integer var2, Integer var3, Integer var4, String var5);

    ProductEntity productById(Integer var1);

    Integer addProduct(ProductEntity var1);

    void updateProduct(ProductEntity var1);

    void deleteProduct(List<Integer> var1);

    Integer productByHot();
}
