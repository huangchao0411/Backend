package com.yousdi.mapper;

import com.yousdi.entity.BeianEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BeianMapper {
    BeianEntity getBeian();

    void updateBeian(BeianEntity var1);
}
