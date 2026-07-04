package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.NewsEntity;
import com.yousdi.utils.PageBean;
import java.util.List;

public interface NewsService extends IService<NewsEntity> {
    PageBean newsList(Integer var1, Integer var2, Integer var3, Integer var4, String var5);

    NewsEntity getNewsById(Integer var1);

    void addNews(NewsEntity var1);

    void updateNews(NewsEntity var1);

    void deleteNews(List<Integer> var1);
}
