package com.yousdi.mapper;

import com.yousdi.entity.Message;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
    List<Message> message(String var1);

    void addMessage(Message var1);

    void updateMessage(Message var1);
}
