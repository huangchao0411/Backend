package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.BeianEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BeianMapper extends BaseMapper<BeianEntity> {
    BeianEntity getBeian();

    void updateBeian(BeianEntity var1);
}
