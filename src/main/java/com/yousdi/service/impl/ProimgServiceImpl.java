package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.mapper.ProimgMapper;
import com.yousdi.entity.Proimg;
import com.yousdi.service.ProimgService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class ProimgServiceImpl implements ProimgService {
    @Autowired
    private ProimgMapper proimgMapper;

    public List<Proimg> proimgList(Integer pid) {
        return this.proimgMapper.prolist(pid);
    }

    public Proimg proimgById(Integer id) {
        return this.proimgMapper.proimgById(id);
    }

    public void addProimg(List<Proimg> proimgs) {
        for(Proimg proimg : proimgs) {
            proimg.setAddTime(LocalDateTime.now());
            proimg.setUpdateTime(LocalDateTime.now());
        }

        this.proimgMapper.addProimg(proimgs);
    }

    public void updateProimg(Proimg proimg) {
        proimg.setUpdateTime(LocalDateTime.now());
        this.proimgMapper.updateProimg(proimg);
    }

    public void deleteProimg(List<Integer> ids) {
        this.proimgMapper.delProimg(ids);
    }
}
