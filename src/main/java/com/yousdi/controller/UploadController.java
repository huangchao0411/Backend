package com.yousdi.controller;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.yousdi.entity.Result;
import com.yousdi.entity.UploadPath;
import com.yousdi.entity.UploadResult;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(
        origins = {"*"}
)
public class UploadController {
    private static final Logger log = LoggerFactory.getLogger(UploadController.class);
    private static final String UPLOAD_PATH = "/data/YSDWEB/szyousidi.com/ysdi/upload/";

    @PostMapping({"/wangupload"})
    public UploadResult wangUpload(MultipartFile file, HttpServletRequest request) {
        if (file != null && !file.isEmpty()) {
            log.info("file: {}", file);

            try {
                String baseUrl = String.format("%s://%s:%s%s", request.getScheme(), request.getServerName(), request.getServerPort(), request.getContextPath());
                String timeDir = this.getTimeDirectory();
                String targetDir = "/data/YSDWEB/szyousidi.com/ysdi/upload/" + timeDir;
                File dir = new File(targetDir);
                if (!dir.exists()) {
                    boolean mkdirSuccess = dir.mkdirs();
                    if (!mkdirSuccess) {
                        return UploadResult.error("上传失败：创建时间目录失败（权限不足/路径非法）");
                    }
                }

                String originalFileName = file.getOriginalFilename();
                String fileExt = originalFileName.substring(originalFileName.lastIndexOf("."));
                String newFileName = UUID.randomUUID().toString() + fileExt;
                File destFile = new File(targetDir + File.separator + newFileName);
                file.transferTo(destFile);
                String relative = baseUrl + "/upload/" + this.getRelativePath(destFile);
                String[] arr = new String[]{relative};
                return UploadResult.success(arr);
            } catch (Exception e) {
                return UploadResult.error("上传失败：" + e.getMessage());
            }
        } else {
            return UploadResult.error("上传失败：文件为空！");
        }
    }

    @PostMapping({"/videoupload"})
    public UploadResult videoUpload(MultipartFile file, HttpServletRequest request) {
        if (file != null && !file.isEmpty()) {
            log.info("file: {}", file);

            try {
                String baseUrl = String.format("%s://%s:%s%s", request.getScheme(), request.getServerName(), request.getServerPort(), request.getContextPath());
                String timeDir = this.getTimeDirectory();
                String targetDir = "/data/YSDWEB/szyousidi.com/ysdi/upload/" + timeDir;
                File dir = new File(targetDir);
                if (!dir.exists()) {
                    boolean mkdirSuccess = dir.mkdirs();
                    if (!mkdirSuccess) {
                        return UploadResult.error("上传失败：创建时间目录失败（权限不足/路径非法）");
                    }
                }

                String originalFileName = file.getOriginalFilename();
                String fileExt = originalFileName.substring(originalFileName.lastIndexOf("."));
                String newFileName = UUID.randomUUID().toString() + fileExt;
                File destFile = new File(targetDir + File.separator + newFileName);
                file.transferTo(destFile);
                String relative = baseUrl + "/upload/" + this.getRelativePath(destFile);
                UploadPath uploadPath = new UploadPath();
                uploadPath.setUrl(relative);
                return UploadResult.success(uploadPath);
            } catch (Exception e) {
                return UploadResult.error("上传失败：" + e.getMessage());
            }
        } else {
            return UploadResult.error("上传失败：文件为空！");
        }
    }

    @PostMapping({"/upload"})
    public Result upload(MultipartFile file, HttpServletRequest request) {
        if (file != null && !file.isEmpty()) {
            log.info("file: {}", file);

            try {
                String baseUrl = String.format("%s://%s:%s%s", request.getScheme(), request.getServerName(), request.getServerPort(), request.getContextPath());
                String timeDir = this.getTimeDirectory();
                String targetDir = "/data/YSDWEB/szyousidi.com/ysdi/upload/" + timeDir;
                File dir = new File(targetDir);
                if (!dir.exists()) {
                    boolean mkdirSuccess = dir.mkdirs();
                    if (!mkdirSuccess) {
                        return Result.error("上传失败：创建时间目录失败（权限不足/路径非法）");
                    }
                }

                String originalFileName = file.getOriginalFilename();
                String fileExt = originalFileName.substring(originalFileName.lastIndexOf("."));
                String newFileName = UUID.randomUUID().toString() + fileExt;
                File destFile = new File(targetDir + File.separator + newFileName);
                file.transferTo(destFile);
                String relative = "/upload/" + this.getRelativePath(destFile);
                return Result.success(relative);
            } catch (Exception e) {
                return Result.error("上传失败：" + e.getMessage());
            }
        } else {
            return Result.error("上传失败：文件为空！");
        }
    }

    public String getRelativePath(File file) {
        Path base = Paths.get("/data/YSDWEB/szyousidi.com/ysdi/upload/");
        Path target = file.toPath();
        return base.relativize(target).toString().replace("\\", "/");
    }

    private String getTimeDirectory() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        return now.format(formatter);
    }
}
