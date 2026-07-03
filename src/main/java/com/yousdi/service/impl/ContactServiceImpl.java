package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.mapper.ContactMapper;
import com.yousdi.entity.Contact;
import com.yousdi.service.ContactService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactMapper contactMapper;

    public List<Contact> contactList(Integer isHot) {
        return this.contactMapper.contactList(isHot);
    }

    public Contact contactById(Integer id) {
        return this.contactMapper.contactById(id);
    }

    public void addContact(Contact contact) {
        contact.setUpdateTime(LocalDateTime.now());
        contact.setAddTime(LocalDateTime.now());
        this.contactMapper.addContact(contact);
    }

    public void updateContact(Contact contact) {
        contact.setUpdateTime(LocalDateTime.now());
        this.contactMapper.updateContact(contact);
    }

    public void delContact(Integer id) {
        this.contactMapper.delContact(id);
    }
}
