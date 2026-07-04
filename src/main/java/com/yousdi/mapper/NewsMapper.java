package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.NewsEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NewsMapper extends BaseMapper<NewsEntity> {

    List<NewsEntity> newsList(@Param("categoryID") Integer var1, @Param("isHot") Integer var2, @Param("keyword") String var3);

    NewsEntity newsById(Integer var1);

    void addNews(NewsEntity var1);

    void updateNews(NewsEntity var1);

    void delNews(@Param("ids") List<Integer> var1);

}
