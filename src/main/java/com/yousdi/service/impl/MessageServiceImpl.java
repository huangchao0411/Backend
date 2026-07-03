package com.yousdi.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.mapper.MessageMapper;
import com.yousdi.entity.Message;
import com.yousdi.entity.PageBean;
import com.yousdi.service.MessageService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    public PageBean message(Integer pageNo, Integer pageSize, String keyword) {
        PageHelper.startPage(pageNo, pageSize);
        List<Message> messages = this.messageMapper.message(keyword);
        Page<Message> pageBean = (Page)messages;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public void addMessage(Message message) {
        message.setAddTime(LocalDateTime.now());
        this.messageMapper.addMessage(message);
    }

    public void updateMessage(Message message) {
        this.messageMapper.updateMessage(message);
    }
}
