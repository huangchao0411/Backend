package com.yousdi.mapper;

import com.yousdi.entity.Proimg;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProimgMapper {
    List<Proimg> prolist(Integer var1);

    Proimg proimgById(Integer var1);

    void addProimg(@Param("proimgs") List<Proimg> var1);

    void updateProimg(Proimg var1);

    void delProimg(@Param("ids") List<Integer> var1);
}
