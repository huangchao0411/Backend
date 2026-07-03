package com.yousdi.mapper;

import com.yousdi.entity.Case;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CaseMapper {
    List<Case> caseList(@Param("categoryID") Integer var1, @Param("keyword") String var2);

    Case caseById(@Param("id") Integer var1);

    void updateCase(Case var1);

    void addCase(Case var1);

    void delCase(@Param("ids") List<Integer> var1);
}
