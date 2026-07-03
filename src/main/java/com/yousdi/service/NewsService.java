package com.yousdi.service;

import com.yousdi.entity.News;
import com.yousdi.entity.PageBean;
import java.util.List;

public interface NewsService {
    PageBean newsList(Integer var1, Integer var2, Integer var3, Integer var4, String var5);

    News getNewsById(Integer var1);

    void addNews(News var1);

    void updateNews(News var1);

    void deleteNews(List<Integer> var1);
}
