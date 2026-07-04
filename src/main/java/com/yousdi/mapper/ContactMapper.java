package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.ContactEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ContactMapper extends BaseMapper<ContactEntity> {

    List<ContactEntity> contactList(Integer var1);

    ContactEntity contactById(@Param("id") Integer var1);

    void addContact(ContactEntity var1);

    void updateContact(ContactEntity var1);

    void delContact(@Param("id") Integer var1);

}
