package com.yousdi.controller;

import com.yousdi.entity.Channel;
import com.yousdi.entity.Result;
import com.yousdi.service.ChannelService;
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
@RequestMapping({"/channel"})
public class ChannelController {
    private static final Logger log = LoggerFactory.getLogger(ChannelController.class);
    @Autowired
    private ChannelService channelService;

    @GetMapping
    public Result channelList(@RequestParam(required = false) Integer isHeader, @RequestParam(required = false) Integer isFooter) {
        log.info("channelList:{}", isHeader);

        try {
            List<Channel> channelList = this.channelService.channelList(isHeader, isFooter);
            return Result.success(channelList);
        } catch (Exception e) {
            return Result.error("获取失败:" + e.getMessage());
        }
    }

    @GetMapping({"/{id}"})
    public Result getChannelById(@PathVariable Integer id) {
        log.info("getChannelById： {}", id);

        try {
            Channel channelById = this.channelService.getChannelById(id);
            return Result.success(channelById);
        } catch (Exception e) {
            return Result.error("获取失败:" + e.getMessage());
        }
    }

    @GetMapping({"/name"})
    public Result getChannelByName(@RequestParam String name) {
        log.info("getChannelByName： {}", name);

        try {
            Channel channelByName = this.channelService.getChannelByName(name);
            return Result.success(channelByName);
        } catch (Exception e) {
            return Result.error("获取失败:" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateChannel(@RequestBody Channel c) {
        log.info("updateChannel： {}", c);

        try {
            this.channelService.updateChannel(c);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }

    @PostMapping
    public Result addChannel(@RequestBody Channel c) {
        log.info("addChannel： {}", c);

        try {
            this.channelService.addChannel(c);
            return Result.success("添加成功");
        } catch (Exception e) {
            return Result.error("添加失败：" + e.getMessage());
        }
    }

    @DeleteMapping({"/{id}"})
    public Result deleteChannel(@PathVariable Integer id) {
        log.info("deleteChannel： {}", id);

        try {
            this.channelService.deleteChannel(id);
            return Result.success("删除成功");
        } catch (Exception e) {
            return Result.error("删除失败：" + e.getMessage());
        }
    }
}
