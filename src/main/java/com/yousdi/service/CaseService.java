package com.yousdi.service;

import com.yousdi.entity.Case;
import com.yousdi.entity.PageBean;
import java.util.List;

public interface CaseService {
    PageBean caseList(Integer var1, Integer var2, Integer var3, String var4);

    Case getCaseById(Integer var1);

    void updateCase(Case var1);

    void addCase(Case var1);

    void deleteCase(List<Integer> var1);
}
