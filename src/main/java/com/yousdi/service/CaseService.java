package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.CaseEntity;
import com.yousdi.utils.PageBean;
import java.util.List;

public interface CaseService extends IService<CaseEntity> {
    PageBean caseList(Integer var1, Integer var2, Integer var3, String var4);

    CaseEntity getCaseById(Integer var1);

    void updateCase(CaseEntity var1);

    void addCase(CaseEntity var1);

    void deleteCase(List<Integer> var1);
}
