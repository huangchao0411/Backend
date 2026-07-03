package com.yousdi.service;

import com.yousdi.entity.Carousel;
import java.util.List;

public interface CarouselService {
    List<Carousel> carousel();

    void addCarousel(Carousel var1);

    void updateCarousel(Carousel var1);

    Carousel getCarouselById(Integer var1);

    void deleteCarousel(List<Integer> var1);
}
