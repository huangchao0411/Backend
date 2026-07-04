package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.CaseImgEntity;
import com.yousdi.entity.CategoryEntity;
import com.yousdi.mapper.CategoryMapper;
import com.yousdi.service.CategoryService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@DS("master")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, CategoryEntity> implements CategoryService {

    public List<CategoryEntity> categoryList(Integer channelID, Integer isHeader, Integer isFooter, Integer id) {
        return baseMapper.categoryList(channelID, isHeader, isFooter, id);
    }

    public void addCategory(CategoryEntity c) {
        c.setAddTime(LocalDateTime.now());
        c.setUpdateTime(LocalDateTime.now());
        baseMapper.addCategory(c);
    }

    public void updateCategory(CategoryEntity c) {
        c.setUpdateTime(LocalDateTime.now());
        baseMapper.updateCategory(c);
    }

    public void deleteCategory(Integer id) {
        baseMapper.delCategory(id);
    }

    public List<CaseImgEntity> getCategoryImgs(Integer categoryID, Integer id) {
        return baseMapper.categoryImgList(categoryID, id);
    }

    public void updateCategoryImgs(CaseImgEntity caseImgEntity) {
        caseImgEntity.setUpdateTime(LocalDateTime.now());
        baseMapper.updateCategoryImgs(caseImgEntity);
    }

    public void deleteCategoryImgs(List<Integer> ids) {
        baseMapper.delCategoryImgs(ids);
    }

    public void addCategoryImgs(CaseImgEntity caseImgEntity) {
        caseImgEntity.setUpdateTime(LocalDateTime.now());
        caseImgEntity.setAddTime(LocalDateTime.now());
        baseMapper.addCategoryImgs(caseImgEntity);
    }
}
