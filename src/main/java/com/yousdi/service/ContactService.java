package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.ContactEntity;

import java.util.List;

public interface ContactService extends IService<ContactEntity> {
    List<ContactEntity> contactList(Integer var1);

    ContactEntity contactById(Integer var1);

    void addContact(ContactEntity var1);

    void updateContact(ContactEntity var1);

    void delContact(Integer var1);
}
