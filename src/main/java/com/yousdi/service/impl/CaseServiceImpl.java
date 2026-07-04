package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yousdi.entity.CaseEntity;
import com.yousdi.mapper.CaseMapper;
import com.yousdi.service.CaseService;
import com.yousdi.utils.PageBean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@DS("master")
public class CaseServiceImpl extends ServiceImpl<CaseMapper, CaseEntity> implements CaseService {

    public PageBean caseList(Integer pageNo, Integer pageSize, Integer categoryID, String keyword) {
        PageHelper.startPage(pageNo, pageSize);
        List<CaseEntity> caseEntities = baseMapper.caseList(categoryID, keyword);
        Page<CaseEntity> pageBean = (Page) caseEntities;
        return new PageBean(pageBean.getTotal(), pageBean.getResult());
    }

    public CaseEntity getCaseById(Integer id) {
        return baseMapper.caseById(id);
    }

    public void updateCase(CaseEntity c) {
        c.setUpdateTime(LocalDateTime.now());
        baseMapper.updateCase(c);
    }

    public void addCase(CaseEntity c) {
        c.setAddTime(LocalDateTime.now());
        c.setUpdateTime(LocalDateTime.now());
        baseMapper.addCase(c);
    }

    public void deleteCase(List<Integer> ids) {
        baseMapper.delCase(ids);
    }
}
