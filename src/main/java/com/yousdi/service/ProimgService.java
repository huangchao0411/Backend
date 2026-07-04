package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.ProimgEntity;

import java.util.List;

public interface ProimgService extends IService<ProimgEntity> {
    List<ProimgEntity> proimgList(Integer var1);

    ProimgEntity proimgById(Integer var1);

    void addProimg(List<ProimgEntity> var1);

    void updateProimg(ProimgEntity var1);

    void deleteProimg(List<Integer> var1);
}
