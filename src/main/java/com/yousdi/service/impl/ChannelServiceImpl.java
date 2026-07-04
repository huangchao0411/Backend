package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.ChannelEntity;
import com.yousdi.mapper.ChannelMapper;
import com.yousdi.service.ChannelService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@DS("master")
public class ChannelServiceImpl extends ServiceImpl<ChannelMapper, ChannelEntity> implements ChannelService {

    public List<ChannelEntity> channelList(Integer isHeader, Integer isFooter) {
        return baseMapper.channelList(isHeader, isFooter);
    }

    public ChannelEntity getChannelById(Integer id) {
        return baseMapper.channelById(id);
    }

    public ChannelEntity getChannelByName(String name) {
        return baseMapper.getChannelByName(name);
    }

    public void updateChannel(ChannelEntity c) {
        c.setUpdateTime(LocalDateTime.now());
        baseMapper.updateChannel(c);
    }

    public void addChannel(ChannelEntity c) {
        c.setAddTime(LocalDateTime.now());
        c.setUpdateTime(LocalDateTime.now());
        baseMapper.addChannel(c);
    }

    public void deleteChannel(Integer id) {
        baseMapper.delChannel(id);
    }
}
