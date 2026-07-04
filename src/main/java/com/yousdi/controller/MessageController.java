package com.yousdi.controller;

import com.yousdi.entity.MessageEntity;
import com.yousdi.utils.PageBean;
import com.yousdi.utils.Result;
import com.yousdi.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping({"/message"})
public class MessageController {
    private static final Logger log = LoggerFactory.getLogger(MessageController.class);
    @Autowired
    private MessageService messageService;

    @GetMapping
    public Result message(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo, @RequestParam(value = "pageSize",defaultValue = "14") Integer pageSize, @RequestParam(required = false) String keyword) {
        log.info("message:{}", keyword);

        try {
            PageBean pageBean = this.messageService.message(pageNo, pageSize, keyword);
            return Result.success(pageBean);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
    }

    @GetMapping({"/info"})
    public Result addMessage(@RequestParam String company, @RequestParam String person, @RequestParam String phone, @RequestParam String email, @RequestParam String content) {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setCompany(company);
        messageEntity.setPerson(person);
        messageEntity.setPhone(phone);
        messageEntity.setEmail(email);
        messageEntity.setContent(content);
        log.info("addMessage：{}", messageEntity);

        try {
            this.messageService.addMessage(messageEntity);
            return Result.success("添加成功！");
        } catch (Exception e) {
            return Result.error("添加失败：" + e.getMessage());
        }
    }

    @PutMapping
    public Result updateMessage(@RequestBody MessageEntity messageEntity) {
        log.info("updateMessage：{}", messageEntity);

        try {
            this.messageService.updateMessage(messageEntity);
            return Result.success("修改成功！");
        } catch (Exception e) {
            return Result.error("修改失败：" + e.getMessage());
        }
    }
}
