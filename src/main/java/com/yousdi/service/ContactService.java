package com.yousdi.service;

import com.yousdi.entity.Contact;
import java.util.List;

public interface ContactService {
    List<Contact> contactList(Integer var1);

    Contact contactById(Integer var1);

    void addContact(Contact var1);

    void updateContact(Contact var1);

    void delContact(Integer var1);
}
