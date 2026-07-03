package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.mapper.NewsMapper;
import com.yousdi.entity.News;
import com.yousdi.entity.PageBean;
import com.yousdi.service.NewsService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;

    public PageBean newsList(Integer pageNo, Integer pageSize, Integer categoryID, Integer isHot, String keywords) {
        PageHelper.startPage(pageNo, pageSize);
        List<News> newsList = this.newsMapper.newsList(categoryID, isHot, keywords);
        Page<News> pageBean = (Page)newsList;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public News getNewsById(Integer id) {
        return this.newsMapper.newsById(id);
    }

    public void addNews(News n) {
        n.setAddTime(LocalDateTime.now());
        n.setUpdateTime(LocalDateTime.now());
        this.newsMapper.addNews(n);
    }

    public void updateNews(News n) {
        n.setUpdateTime(LocalDateTime.now());
        this.newsMapper.updateNews(n);
    }

    public void deleteNews(List<Integer> ids) {
        this.newsMapper.delNews(ids);
    }
}
