package com.yousdi.mapper;

import com.yousdi.entity.News;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NewsMapper {
    List<News> newsList(@Param("categoryID") Integer var1, @Param("isHot") Integer var2, @Param("keyword") String var3);

    News newsById(Integer var1);

    void addNews(News var1);

    void updateNews(News var1);

    void delNews(@Param("ids") List<Integer> var1);
}
