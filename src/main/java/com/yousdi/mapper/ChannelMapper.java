package com.yousdi.mapper;

import com.yousdi.entity.Channel;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChannelMapper {
    List<Channel> channelList(@Param("isHeader") Integer var1, @Param("isFooter") Integer var2);

    Channel channelById(Integer var1);

    Channel getChannelByName(String var1);

    void updateChannel(Channel var1);

    void addChannel(Channel var1);

    void delChannel(Integer var1);
}
