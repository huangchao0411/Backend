package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.CaseImgEntity;
import com.yousdi.entity.CategoryEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryService extends IService<CategoryEntity> {
    List<CategoryEntity> categoryList(Integer var1, Integer var2, Integer var3, Integer var4);

    void addCategory(CategoryEntity var1);

    void updateCategory(CategoryEntity var1);

    void deleteCategory(@Param("id") Integer var1);

    List<CaseImgEntity> getCategoryImgs(Integer var1, Integer var2);

    void updateCategoryImgs(CaseImgEntity var1);

    void deleteCategoryImgs(List<Integer> var1);

    void addCategoryImgs(CaseImgEntity var1);
}
