package com.yousdi.controller;

import com.yousdi.entity.Media;
import com.yousdi.entity.Result;
import com.yousdi.service.MediaService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping({"/media"})
public class MediaController {
    private static final Logger log = LoggerFactory.getLogger(MediaController.class);
    @Autowired
    private MediaService mediaService;

    @GetMapping
    public Result media(@RequestParam(required = false) Integer isShare) {
        log.info("media");

        try {
            List<Media> mediaList = this.mediaService.media(isShare);
            return Result.success(mediaList);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @GetMapping({"/{id}"})
    public Result getMediaById(@PathVariable Integer id) {
        log.info("getMediaById： {}", id);

        try {
            Media mediaById = this.mediaService.getMediaById(id);
            return Result.success(mediaById);
        } catch (Exception e) {
            return Result.error("获取失败：" + e.getMessage());
        }
    }

    @PostMapping
    public Result addMedia(@RequestBody Media media) {
        log.info("addMedia：{}", media);

        try {
            this.mediaService.addMedia(media);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateMedia(@RequestBody Media media) {
        log.info("updateMedia：{}", media);

        try {
            this.mediaService.updateMedia(media);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }

    @DeleteMapping
    public Result deleteMedia(@RequestBody List<Integer> ids) {
        log.info("deleteMedia：{}", ids);

        try {
            this.mediaService.delMedia(ids);
            return Result.success("删除成功");
        } catch (Exception e) {
            return Result.error("删除失败：" + e.getMessage());
        }
    }
}
