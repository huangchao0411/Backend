package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.mapper.CompanyMapper;
import com.yousdi.entity.Company;
import com.yousdi.service.CompanyService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    public Company company() {
        return this.companyMapper.company();
    }

    public void updateCompany(Company company) {
        company.setUpdateTime(LocalDateTime.now());
        this.companyMapper.updateCompany(company);
    }
}
