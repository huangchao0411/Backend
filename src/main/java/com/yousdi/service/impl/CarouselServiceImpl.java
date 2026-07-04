package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yousdi.entity.CarouselEntity;
import com.yousdi.mapper.CarouselMapper;
import com.yousdi.service.CarouselService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class CarouselServiceImpl extends ServiceImpl<CarouselMapper, CarouselEntity> implements CarouselService {

    public List<CarouselEntity> carousel() {
        return baseMapper.carousel();
    }

    public void addCarousel(CarouselEntity carouselEntity) {
        carouselEntity.setAddTime(LocalDateTime.now());
        carouselEntity.setUpdateTime(LocalDateTime.now());
        baseMapper.addCarousel(carouselEntity);
    }

    public void updateCarousel(CarouselEntity carouselEntity) {
        carouselEntity.setAddTime(LocalDateTime.now());
        carouselEntity.setUpdateTime(LocalDateTime.now());
        baseMapper.updateCarousel(carouselEntity);
    }

    public CarouselEntity getCarouselById(Integer id) {
        return baseMapper.carouselById(id);
    }

    public void deleteCarousel(List<Integer> ids) {
        baseMapper.delCarousel(ids);
    }
}
