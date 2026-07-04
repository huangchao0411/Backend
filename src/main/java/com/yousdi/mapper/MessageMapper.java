package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.MessageEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper extends BaseMapper<MessageEntity> {

    List<MessageEntity> message(String var1);

    void addMessage(MessageEntity var1);

    void updateMessage(MessageEntity var1);

}
