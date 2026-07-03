package com.yousdi.mapper;

import com.yousdi.entity.Media;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MediaMapper {
    List<Media> media(Integer var1);

    Media getMediaById(Integer var1);

    void updateMedia(Media var1);

    void delMedia(@Param("ids") List<Integer> var1);

    void addMedia(Media var1);
}
