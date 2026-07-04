package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.CaseImgEntity;
import com.yousdi.entity.CategoryEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {

    List<CategoryEntity> categoryList(@Param("channelID") Integer var1, @Param("isHeader") Integer var2, @Param("isFooter") Integer var3, @Param("id") Integer var4);

    void addCategory(CategoryEntity var1);

    void updateCategory(CategoryEntity var1);

    void delCategory(Integer var1);

    List<CaseImgEntity> categoryImgList(@Param("categoryID") Integer var1, @Param("id") Integer var2);

    void updateCategoryImgs(CaseImgEntity var1);

    void delCategoryImgs(@Param("ids") List<Integer> var1);

    void addCategoryImgs(CaseImgEntity var1);

}
