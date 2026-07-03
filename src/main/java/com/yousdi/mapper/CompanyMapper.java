package com.yousdi.mapper;

import com.yousdi.entity.Company;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {
    Company company();

    void updateCompany(Company var1);
}
