package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.CompanyEntity;
import com.yousdi.mapper.CompanyMapper;
import com.yousdi.service.CompanyService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@DS("master")
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, CompanyEntity> implements CompanyService {

    public CompanyEntity company() {
        return baseMapper.company();
    }

    public void updateCompany(CompanyEntity companyEntity) {
        companyEntity.setUpdateTime(LocalDateTime.now());
        baseMapper.updateCompany(companyEntity);
    }
}
