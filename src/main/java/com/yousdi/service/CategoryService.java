package com.yousdi.service;

import com.yousdi.entity.CaseImg;
import com.yousdi.entity.Category;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryService {
    List<Category> categoryList(Integer var1, Integer var2, Integer var3, Integer var4);

    void addCategory(Category var1);

    void updateCategory(Category var1);

    void deleteCategory(@Param("id") Integer var1);

    List<CaseImg> getCategoryImgs(Integer var1, Integer var2);

    void updateCategoryImgs(CaseImg var1);

    void deleteCategoryImgs(List<Integer> var1);

    void addCategoryImgs(CaseImg var1);
}
