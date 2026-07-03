package com.yousdi.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.yousdi.mapper.CarouselMapper;
import com.yousdi.entity.Carousel;
import com.yousdi.service.CarouselService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class CarouselServiceImpl implements CarouselService {
    @Autowired
    private CarouselMapper carouselMapper;

    public List<Carousel> carousel() {
        return this.carouselMapper.carousel();
    }

    public void addCarousel(Carousel carousel) {
        carousel.setAddTime(LocalDateTime.now());
        carousel.setUpdateTime(LocalDateTime.now());
        this.carouselMapper.addCarousel(carousel);
    }

    public void updateCarousel(Carousel carousel) {
        carousel.setAddTime(LocalDateTime.now());
        carousel.setUpdateTime(LocalDateTime.now());
        this.carouselMapper.updateCarousel(carousel);
    }

    public Carousel getCarouselById(Integer id) {
        return this.carouselMapper.carouselById(id);
    }

    public void deleteCarousel(List<Integer> ids) {
        this.carouselMapper.delCarousel(ids);
    }
}
