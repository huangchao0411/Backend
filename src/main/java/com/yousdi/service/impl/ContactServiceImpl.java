package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.mapper.ContactMapper;
import com.yousdi.entity.ContactEntity;
import com.yousdi.service.ContactService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ContactServiceImpl extends ServiceImpl<ContactMapper, ContactEntity> implements ContactService {
    @Autowired
    private ContactMapper contactMapper;

    public List<ContactEntity> contactList(Integer isHot) {
        return this.contactMapper.contactList(isHot);
    }

    public ContactEntity contactById(Integer id) {
        return this.contactMapper.contactById(id);
    }

    public void addContact(ContactEntity contactEntity) {
        contactEntity.setUpdateTime(LocalDateTime.now());
        contactEntity.setAddTime(LocalDateTime.now());
        this.contactMapper.addContact(contactEntity);
    }

    public void updateContact(ContactEntity contactEntity) {
        contactEntity.setUpdateTime(LocalDateTime.now());
        this.contactMapper.updateContact(contactEntity);
    }

    public void delContact(Integer id) {
        this.contactMapper.delContact(id);
    }
}
