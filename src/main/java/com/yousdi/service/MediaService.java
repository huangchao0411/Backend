package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.MediaEntity;

import java.util.List;

public interface MediaService extends IService<MediaEntity> {
    List<MediaEntity> media(Integer var1);

    MediaEntity getMediaById(Integer var1);

    void updateMedia(MediaEntity var1);

    void delMedia(List<Integer> var1);

    void addMedia(MediaEntity var1);
}
