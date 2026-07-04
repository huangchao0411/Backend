package com.yousdi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.MediaEntity;
import com.yousdi.mapper.MediaMapper;
import com.yousdi.service.MediaService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaServiceImpl extends ServiceImpl<MediaMapper, MediaEntity> implements MediaService {

    public List<MediaEntity> media(Integer isShare) {
        return baseMapper.media(isShare);
    }

    public MediaEntity getMediaById(Integer id) {
        return baseMapper.getMediaById(id);
    }

    public void updateMedia(MediaEntity mediaEntity) {
        mediaEntity.setUpdateTime(LocalDateTime.now());
        baseMapper.updateMedia(mediaEntity);
    }

    public void delMedia(List<Integer> ids) {
        baseMapper.delMedia(ids);
    }

    public void addMedia(MediaEntity mediaEntity) {
        mediaEntity.setAddTime(LocalDateTime.now());
        mediaEntity.setUpdateTime(LocalDateTime.now());
        baseMapper.addMedia(mediaEntity);
    }
}
