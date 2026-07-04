package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.CompanyEntity;

public interface CompanyService extends IService<CompanyEntity> {
    CompanyEntity company();

    void updateCompany(CompanyEntity var1);
}
