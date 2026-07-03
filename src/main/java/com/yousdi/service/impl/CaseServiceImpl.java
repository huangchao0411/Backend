package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.mapper.CaseMapper;
import com.yousdi.entity.Case;
import com.yousdi.entity.PageBean;
import com.yousdi.service.CaseService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class CaseServiceImpl implements CaseService {
    @Autowired
    private CaseMapper caseMapper;

    public PageBean caseList(Integer pageNo, Integer pageSize, Integer categoryID, String keyword) {
        PageHelper.startPage(pageNo, pageSize);
        List<Case> cases = this.caseMapper.caseList(categoryID, keyword);
        Page<Case> pageBean = (Page)cases;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public Case getCaseById(Integer id) {
        return this.caseMapper.caseById(id);
    }

    public void updateCase(Case c) {
        c.setUpdateTime(LocalDateTime.now());
        this.caseMapper.updateCase(c);
    }

    public void addCase(Case c) {
        c.setAddTime(LocalDateTime.now());
        c.setUpdateTime(LocalDateTime.now());
        this.caseMapper.addCase(c);
    }

    public void deleteCase(List<Integer> ids) {
        this.caseMapper.delCase(ids);
    }
}
