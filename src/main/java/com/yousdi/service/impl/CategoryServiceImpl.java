package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.mapper.CategoryMapper;
import com.yousdi.entity.CaseImg;
import com.yousdi.entity.Category;
import com.yousdi.service.CategoryService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> categoryList(Integer channelID, Integer isHeader, Integer isFooter, Integer id) {
        return this.categoryMapper.categoryList(channelID, isHeader, isFooter, id);
    }

    public void addCategory(Category c) {
        c.setAddTime(LocalDateTime.now());
        c.setUpdateTime(LocalDateTime.now());
        this.categoryMapper.addCategory(c);
    }

    public void updateCategory(Category c) {
        c.setUpdateTime(LocalDateTime.now());
        this.categoryMapper.updateCategory(c);
    }

    public void deleteCategory(Integer id) {
        this.categoryMapper.delCategory(id);
    }

    public List<CaseImg> getCategoryImgs(Integer categoryID, Integer id) {
        return this.categoryMapper.categoryImgList(categoryID, id);
    }

    public void updateCategoryImgs(CaseImg caseImg) {
        caseImg.setUpdateTime(LocalDateTime.now());
        this.categoryMapper.updateCategoryImgs(caseImg);
    }

    public void deleteCategoryImgs(List<Integer> ids) {
        this.categoryMapper.delCategoryImgs(ids);
    }

    public void addCategoryImgs(CaseImg caseImg) {
        caseImg.setUpdateTime(LocalDateTime.now());
        caseImg.setAddTime(LocalDateTime.now());
        this.categoryMapper.addCategoryImgs(caseImg);
    }
}
