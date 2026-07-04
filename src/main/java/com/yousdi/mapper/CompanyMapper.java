package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.CompanyEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper extends BaseMapper<CompanyEntity> {

    CompanyEntity company();

    void updateCompany(CompanyEntity var1);

}
