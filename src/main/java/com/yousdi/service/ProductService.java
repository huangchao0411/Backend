package com.yousdi.service;

import com.yousdi.entity.PageBean;
import com.yousdi.entity.Product;
import java.util.List;

public interface ProductService {
    PageBean productList(Integer var1, Integer var2, Integer var3, Integer var4, String var5);

    Product productById(Integer var1);

    Integer addProduct(Product var1);

    void updateProduct(Product var1);

    void deleteProduct(List<Integer> var1);

    Integer productByHot();
}
