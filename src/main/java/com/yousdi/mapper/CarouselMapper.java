package com.yousdi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yousdi.entity.CarouselEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarouselMapper extends BaseMapper<CarouselEntity> {

    List<CarouselEntity> carousel();

    void addCarousel(CarouselEntity var1);

    void updateCarousel(CarouselEntity var1);

    CarouselEntity carouselById(Integer var1);

    void delCarousel(@Param("ids") List<Integer> var1);

}
