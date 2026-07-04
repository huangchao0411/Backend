package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.CaseEntity;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CaseMapper extends BaseMapper<CaseEntity> {

    List<CaseEntity> caseList(@Param("categoryID") Integer var1, @Param("keyword") String var2);

    CaseEntity caseById(@Param("id") Integer var1);

    void updateCase(CaseEntity var1);

    void addCase(CaseEntity var1);

    void delCase(@Param("ids") List<Integer> var1);

}
