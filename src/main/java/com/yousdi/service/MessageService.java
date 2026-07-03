package com.yousdi.service;

import com.yousdi.entity.Message;
import com.yousdi.entity.PageBean;

public interface MessageService {
    PageBean message(Integer var1, Integer var2, String var3);

    void addMessage(Message var1);

    void updateMessage(Message var1);
}
