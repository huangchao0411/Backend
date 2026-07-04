package com.yousdi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.entity.MessageEntity;
import com.yousdi.mapper.MessageMapper;
import com.yousdi.service.MessageService;
import com.yousdi.utils.PageBean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, MessageEntity> implements MessageService {

    public PageBean message(Integer pageNo, Integer pageSize, String keyword) {
        PageHelper.startPage(pageNo, pageSize);
        List<MessageEntity> messageEntities = baseMapper.message(keyword);
        Page<MessageEntity> pageBean = (Page) messageEntities;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public void addMessage(MessageEntity messageEntity) {
        messageEntity.setAddTime(LocalDateTime.now());
        baseMapper.addMessage(messageEntity);
    }

    public void updateMessage(MessageEntity messageEntity) {
        baseMapper.updateMessage(messageEntity);
    }
}
