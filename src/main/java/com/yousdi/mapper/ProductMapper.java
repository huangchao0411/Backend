package com.yousdi.mapper;

import com.yousdi.entity.Product;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    List<Product> productList(@Param("categoryID") Integer var1, @Param("isHot") Integer var2, @Param("keyword") String var3);

    Product productById(Integer var1);

    Integer addProduct(Product var1);

    void updateProduct(Product var1);

    void delProduct(@Param("ids") List<Integer> var1);

    Integer productByHot();
}
