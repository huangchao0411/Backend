package com.yousdi.controller;

import com.yousdi.entity.Company;
import com.yousdi.entity.Result;
import com.yousdi.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping({"/company"})
public class CompanyController {
    private static final Logger log = LoggerFactory.getLogger(CompanyController.class);
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public Result company() {
        log.info("company");

        try {
            Company company = this.companyService.company();
            return Result.success(company);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateCompany(@RequestBody Company company) {
        log.info("updateCompany：{}", company);

        try {
            this.companyService.updateCompany(company);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }
}
