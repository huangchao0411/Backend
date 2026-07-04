package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.MessageEntity;
import com.yousdi.utils.PageBean;

public interface MessageService extends IService<MessageEntity> {
    PageBean message(Integer var1, Integer var2, String var3);

    void addMessage(MessageEntity var1);

    void updateMessage(MessageEntity var1);
}
