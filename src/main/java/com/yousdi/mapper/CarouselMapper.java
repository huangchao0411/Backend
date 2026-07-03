package com.yousdi.mapper;

import com.yousdi.entity.Carousel;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarouselMapper {
    List<Carousel> carousel();

    void addCarousel(Carousel var1);

    void updateCarousel(Carousel var1);

    Carousel carouselById(Integer var1);

    void delCarousel(@Param("ids") List<Integer> var1);
}
