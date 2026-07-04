package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.MediaEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MediaMapper extends BaseMapper<MediaEntity> {

    List<MediaEntity> media(Integer var1);

    MediaEntity getMediaById(Integer var1);

    void updateMedia(MediaEntity var1);

    void delMedia(@Param("ids") List<Integer> var1);

    void addMedia(MediaEntity var1);

}
