package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.RoleEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RoleMapper extends BaseMapper<RoleEntity> {
    @Select({"select * from role"})
    List<RoleEntity> getAllRole();
}
