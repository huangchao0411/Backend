package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.ChannelEntity;

import java.util.List;

public interface ChannelService extends IService<ChannelEntity> {
    List<ChannelEntity> channelList(Integer var1, Integer var2);

    ChannelEntity getChannelById(Integer var1);

    ChannelEntity getChannelByName(String var1);

    void updateChannel(ChannelEntity var1);

    void addChannel(ChannelEntity var1);

    void deleteChannel(Integer var1);
}
