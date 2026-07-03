package com.yousdi.service;

import com.yousdi.entity.Channel;
import java.util.List;

public interface ChannelService {
    List<Channel> channelList(Integer var1, Integer var2);

    Channel getChannelById(Integer var1);

    Channel getChannelByName(String var1);

    void updateChannel(Channel var1);

    void addChannel(Channel var1);

    void deleteChannel(Integer var1);
}
