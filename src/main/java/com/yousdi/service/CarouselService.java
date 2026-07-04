package com.yousdi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yousdi.entity.CarouselEntity;

import java.util.List;

public interface CarouselService extends IService<CarouselEntity> {
    List<CarouselEntity> carousel();

    void addCarousel(CarouselEntity var1);

    void updateCarousel(CarouselEntity var1);

    CarouselEntity getCarouselById(Integer var1);

    void deleteCarousel(List<Integer> var1);
}
