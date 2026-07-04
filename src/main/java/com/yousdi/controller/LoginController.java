package com.yousdi.controller;

import com.yousdi.utils.PageBean;
import com.yousdi.entity.PasswordEntity;
import com.yousdi.utils.Result;
import com.yousdi.entity.UserEntity;
import com.yousdi.service.LoginService;
import com.yousdi.service.UserService;
import com.yousdi.utils.JwtUtils;
import java.util.HashMap;
import java.util.Map;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
        origins = {"*"}
)
@RestController
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserService userService;

    @GetMapping({"/login"})
    public Result login(@RequestParam String username, @RequestParam String password) {
        log.info("login： {}", username);
        UserEntity userEntity = this.loginService.login(username, password);
        if (userEntity != null && userEntity.getIsLock() == 1) {
            Map<String, Object> claims = new HashMap();
            claims.put("id", userEntity.getId());
            claims.put("username", userEntity.getUsername());
            claims.put("role", userEntity.getRoleID());
            String jws = JwtUtils.generateJwt(claims);
            System.out.println(jws);
            userEntity.setToken(jws);
            return Result.success(userEntity);
        } else {
            return userEntity != null && userEntity.getIsLock() == 0 ? Result.error("账号已锁") : Result.error("账号或密码有误");
        }
    }

    @PostMapping({"/user"})
    public Result addUser(@RequestBody UserEntity u) {
        log.info("addUser： {}", u);

        try {
            this.userService.addUser(u);
            return Result.success();
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }

    @PutMapping({"/user"})
    public Result updateUser(@RequestBody UserEntity u) {
        log.info("updateUser： {}", u);

        try {
            this.userService.modifyUser(u);
            return Result.success("修改成功");
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error("修改出错：" + mgs);
        }
    }

    @PutMapping({"/user/password"})
    public Result updateUserPsd(@RequestBody PasswordEntity psd) {
        log.info("updateUser： {}", psd);

        try {
            this.userService.modifyUserPsd(psd);
            return Result.success("修改成功");
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error("修改出错：" + mgs);
        }
    }

    @GetMapping({"/user"})
    public Result getUser(@RequestBody UserEntity u) {
        log.info("getUser： {}", u);

        try {
            UserEntity userEntity = this.userService.getUser(u.getUsername(), u.getPassword());
            return Result.success(userEntity);
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }

    @GetMapping({"/alluser"})
    public Result getAllUser(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo, @RequestParam(value = "pageSize",defaultValue = "15") int pageSize) {
        log.info("getAllUser,页码：{}, 条数：{}", pageNo, pageSize);

        try {
            PageBean pageBean = this.userService.getAllUser(pageNo, pageSize);
            return Result.success(pageBean);
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }

    @GetMapping({"/user/{id}"})
    public Result getUserById(@PathVariable Integer id) {
        log.info("getUserById： {}", id);

        try {
            UserEntity userEntity = this.userService.getUserById(id);
            return Result.success(userEntity);
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error(mgs);
        }
    }

    @DeleteMapping({"/user/{id}"})
    public Result deleteUser(@PathVariable Integer id, @RequestParam Integer isLock) {
        log.info("deleteUser： {}", id);

        try {
            this.userService.deleteUser(id, isLock);
            return Result.success("锁定成功");
        } catch (Exception e) {
            String mgs = e.getMessage();
            return Result.error("锁定失败：" + mgs);
        }
    }
}
