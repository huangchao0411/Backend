package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.ProductEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper extends BaseMapper<ProductEntity> {
    List<ProductEntity> productList(@Param("categoryID") Integer var1, @Param("isHot") Integer var2, @Param("keyword") String var3);

    ProductEntity productById(Integer var1);

    Integer addProduct(ProductEntity var1);

    void updateProduct(ProductEntity var1);

    void delProduct(@Param("ids") List<Integer> var1);

    Integer productByHot();
}
