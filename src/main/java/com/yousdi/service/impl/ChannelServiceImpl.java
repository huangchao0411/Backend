package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.mapper.ChannelMapper;
import com.yousdi.entity.Channel;
import com.yousdi.service.ChannelService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    private ChannelMapper channelMapper;

    public List<Channel> channelList(Integer isHeader, Integer isFooter) {
        return this.channelMapper.channelList(isHeader, isFooter);
    }

    public Channel getChannelById(Integer id) {
        return this.channelMapper.channelById(id);
    }

    public Channel getChannelByName(String name) {
        return this.channelMapper.getChannelByName(name);
    }

    public void updateChannel(Channel c) {
        c.setUpdateTime(LocalDateTime.now());
        this.channelMapper.updateChannel(c);
    }

    public void addChannel(Channel c) {
        c.setAddTime(LocalDateTime.now());
        c.setUpdateTime(LocalDateTime.now());
        this.channelMapper.addChannel(c);
    }

    public void deleteChannel(Integer id) {
        this.channelMapper.delChannel(id);
    }
}
