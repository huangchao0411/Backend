package com.yousdi.controller;

import com.yousdi.entity.Contact;
import com.yousdi.entity.Result;
import com.yousdi.service.ContactService;
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
@RequestMapping({"/contact"})
public class ContactController {
    private static final Logger log = LoggerFactory.getLogger(ContactController.class);
    @Autowired
    private ContactService contactService;

    @GetMapping
    public Result contactList(@RequestParam(required = false) Integer isHot) {
        log.info("contactlist");

        try {
            List<Contact> contactList = this.contactService.contactList(isHot);
            return Result.success(contactList);
        } catch (Exception ex) {
            return Result.error("获取失败：" + ex.getMessage());
        }
    }

    @GetMapping({"/{id}"})
    public Result contactById(@PathVariable Integer id) {
        log.info("contactByID");

        try {
            Contact contact = this.contactService.contactById(id);
            return Result.success(contact);
        } catch (Exception ex) {
            return Result.error("获取失败：" + ex.getMessage());
        }
    }

    @PostMapping
    public Result addContact(Contact contact) {
        log.info("addContact：" + contact);

        try {
            this.contactService.addContact(contact);
            return Result.success("添加成功");
        } catch (Exception ex) {
            return Result.error("添加失败：" + ex.getMessage());
        }
    }

    @PutMapping
    public Result updateContact(@RequestBody Contact contact) {
        log.info("updateContact:" + contact);

        try {
            this.contactService.updateContact(contact);
            return Result.success("修改成功");
        } catch (Exception ex) {
            return Result.error("修改失败:" + ex.getMessage());
        }
    }

    @DeleteMapping({"/{id}"})
    public Result delContact(@PathVariable Integer id) {
        log.info("delContact:" + id);

        try {
            this.contactService.delContact(id);
            return Result.success("删除失败");
        } catch (Exception var3) {
            return Result.error("删除失败");
        }
    }
}
