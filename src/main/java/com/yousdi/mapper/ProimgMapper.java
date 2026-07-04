package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.ProimgEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProimgMapper extends BaseMapper<ProimgEntity> {
    List<ProimgEntity> prolist(Integer var1);

    ProimgEntity proimgById(Integer var1);

    void addProimg(@Param("proimgs") List<ProimgEntity> var1);

    void updateProimg(ProimgEntity var1);

    void delProimg(@Param("ids") List<Integer> var1);
}
