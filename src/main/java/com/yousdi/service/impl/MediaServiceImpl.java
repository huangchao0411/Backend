package com.yousdi.service.impl;

import com.yousdi.mapper.MediaMapper;
import com.yousdi.entity.Media;
import com.yousdi.service.MediaService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaServiceImpl implements MediaService {
    @Autowired
    private MediaMapper mediaMapper;

    public List<Media> media(Integer isShare) {
        return this.mediaMapper.media(isShare);
    }

    public Media getMediaById(Integer id) {
        return this.mediaMapper.getMediaById(id);
    }

    public void updateMedia(Media media) {
        media.setUpdateTime(LocalDateTime.now());
        this.mediaMapper.updateMedia(media);
    }

    public void delMedia(List<Integer> ids) {
        this.mediaMapper.delMedia(ids);
    }

    public void addMedia(Media media) {
        media.setAddTime(LocalDateTime.now());
        media.setUpdateTime(LocalDateTime.now());
        this.mediaMapper.addMedia(media);
    }
}
