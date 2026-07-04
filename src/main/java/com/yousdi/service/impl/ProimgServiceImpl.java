package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.ProimgEntity;
import com.yousdi.mapper.ProimgMapper;
import com.yousdi.service.ProimgService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ProimgServiceImpl extends ServiceImpl<ProimgMapper, ProimgEntity> implements ProimgService {

    public List<ProimgEntity> proimgList(Integer pid) {
        return baseMapper.prolist(pid);
    }

    public ProimgEntity proimgById(Integer id) {
        return baseMapper.proimgById(id);
    }

    public void addProimg(List<ProimgEntity> proimgEntities) {
        for(ProimgEntity proimgEntity : proimgEntities) {
            proimgEntity.setAddTime(LocalDateTime.now());
            proimgEntity.setUpdateTime(LocalDateTime.now());
        }

        baseMapper.addProimg(proimgEntities);
    }

    public void updateProimg(ProimgEntity proimgEntity) {
        proimgEntity.setUpdateTime(LocalDateTime.now());
        baseMapper.updateProimg(proimgEntity);
    }

    public void deleteProimg(List<Integer> ids) {
        baseMapper.delProimg(ids);
    }
}
