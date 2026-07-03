package com.yousdi.service;

import com.yousdi.entity.Media;
import java.util.List;

public interface MediaService {
    List<Media> media(Integer var1);

    Media getMediaById(Integer var1);

    void updateMedia(Media var1);

    void delMedia(List<Integer> var1);

    void addMedia(Media var1);
}
