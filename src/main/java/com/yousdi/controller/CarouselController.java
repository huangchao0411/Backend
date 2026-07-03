package com.yousdi.controller;

import com.yousdi.entity.Carousel;
import com.yousdi.entity.Result;
import com.yousdi.service.CarouselService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
        origins = {"*"}
)
@RestController
@RequestMapping({"/carousel"})
public class CarouselController {
    private static final Logger log = LoggerFactory.getLogger(CarouselController.class);
    @Autowired
    private CarouselService carouselService;

    @GetMapping
    public Result carousel() {
        log.info("carousel");
        List<Carousel> carousels = this.carouselService.carousel();
        return Result.success(carousels);
    }

    @GetMapping({"/{id}"})
    public Result getCarouselById(@PathVariable Integer id) {
        log.info("getCarouselById： {}", id);
        return Result.success(this.carouselService.getCarouselById(id));
    }

    @PostMapping
    public Result addCarousel(@RequestBody Carousel carousel) {
        log.info("addCarousel： {}", carousel);

        try {
            this.carouselService.addCarousel(carousel);
            return Result.success("添加成功");
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }

    @PutMapping
    public Result updateCarousel(@RequestBody Carousel carousel) {
        log.info("updateCarousel： {}", carousel);

        try {
            this.carouselService.updateCarousel(carousel);
            return Result.success("修改成功");
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }

    @DeleteMapping
    public Result deleteCarousel(@RequestBody List<Integer> ids) {
        log.info("deleteCarousel： {}", ids);

        try {
            this.carouselService.deleteCarousel(ids);
            return Result.success("删除成功");
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }
}
