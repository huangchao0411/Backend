package com.yousdi.service;

import com.yousdi.entity.Proimg;
import java.util.List;

public interface ProimgService {
    List<Proimg> proimgList(Integer var1);

    Proimg proimgById(Integer var1);

    void addProimg(List<Proimg> var1);

    void updateProimg(Proimg var1);

    void deleteProimg(List<Integer> var1);
}
