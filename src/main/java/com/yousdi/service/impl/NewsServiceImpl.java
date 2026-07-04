package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.entity.NewsEntity;
import com.yousdi.mapper.NewsMapper;
import com.yousdi.utils.PageBean;
import com.yousdi.service.NewsService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class NewsServiceImpl extends ServiceImpl<NewsMapper, NewsEntity> implements NewsService {

    public PageBean newsList(Integer pageNo, Integer pageSize, Integer categoryID, Integer isHot, String keywords) {
        PageHelper.startPage(pageNo, pageSize);
        List<NewsEntity> newsEntityList = baseMapper.newsList(categoryID, isHot, keywords);
        Page<NewsEntity> pageBean = (Page) newsEntityList;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public NewsEntity getNewsById(Integer id) {
        return baseMapper.newsById(id);
    }

    public void addNews(NewsEntity n) {
        n.setAddTime(LocalDateTime.now());
        n.setUpdateTime(LocalDateTime.now());
        baseMapper.addNews(n);
    }

    public void updateNews(NewsEntity n) {
        n.setUpdateTime(LocalDateTime.now());
        baseMapper.updateNews(n);
    }

    public void deleteNews(List<Integer> ids) {
        baseMapper.delNews(ids);
    }
}
