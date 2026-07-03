package com.yousdi.mapper;

import com.yousdi.entity.Contact;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ContactMapper {
    List<Contact> contactList(Integer var1);

    Contact contactById(@Param("id") Integer var1);

    void addContact(Contact var1);

    void updateContact(Contact var1);

    void delContact(@Param("id") Integer var1);
}
