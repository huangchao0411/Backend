package com.yousdi.mapper;

import com.yousdi.entity.CaseImg;
import com.yousdi.entity.Category;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryMapper {
    List<Category> categoryList(@Param("channelID") Integer var1, @Param("isHeader") Integer var2, @Param("isFooter") Integer var3, @Param("id") Integer var4);

    void addCategory(Category var1);

    void updateCategory(Category var1);

    void delCategory(Integer var1);

    List<CaseImg> categoryImgList(@Param("categoryID") Integer var1, @Param("id") Integer var2);

    void updateCategoryImgs(CaseImg var1);

    void delCategoryImgs(@Param("ids") List<Integer> var1);

    void addCategoryImgs(CaseImg var1);
}
