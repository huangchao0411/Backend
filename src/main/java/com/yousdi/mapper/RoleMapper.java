package com.yousdi.mapper;

import com.yousdi.entity.Role;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RoleMapper {
    @Select({"select * from role"})
    List<Role> getAllRole();
}
