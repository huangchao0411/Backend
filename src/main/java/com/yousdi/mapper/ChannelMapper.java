package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.ChannelEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ChannelMapper extends BaseMapper<ChannelEntity> {

    List<ChannelEntity> channelList(@Param("isHeader") Integer var1, @Param("isFooter") Integer var2);

    ChannelEntity channelById(Integer var1);

    ChannelEntity getChannelByName(String var1);

    void updateChannel(ChannelEntity var1);

    void addChannel(ChannelEntity var1);

    void delChannel(Integer var1);

}
