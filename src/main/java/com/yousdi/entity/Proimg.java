package com.yousdi.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Proimg implements Serializable {

    private Integer id;
    private Integer pid;
    private String img;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Proimg)) {
            return false;
        } else {
            Proimg other = (Proimg)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
                    return false;
                }

                Object this$pid = this.getPid();
                Object other$pid = other.getPid();
                if (this$pid == null) {
                    if (other$pid != null) {
                        return false;
                    }
                } else if (!this$pid.equals(other$pid)) {
                    return false;
                }

                Object this$img = this.getImg();
                Object other$img = other.getImg();
                if (this$img == null) {
                    if (other$img != null) {
                        return false;
                    }
                } else if (!this$img.equals(other$img)) {
                    return false;
                }

                Object this$addTime = this.getAddTime();
                Object other$addTime = other.getAddTime();
                if (this$addTime == null) {
                    if (other$addTime != null) {
                        return false;
                    }
                } else if (!this$addTime.equals(other$addTime)) {
                    return false;
                }

                Object this$updateTime = this.getUpdateTime();
                Object other$updateTime = other.getUpdateTime();
                if (this$updateTime == null) {
                    if (other$updateTime != null) {
                        return false;
                    }
                } else if (!this$updateTime.equals(other$updateTime)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Proimg;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $pid = this.getPid();
        result = result * 59 + ($pid == null ? 43 : $pid.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "Proimg(id=" + this.getId() + ", pid=" + this.getPid() + ", img=" + this.getImg() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public Proimg() {
    }

    public Proimg(Integer id, Integer pid, String img, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.pid = pid;
        this.img = img;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }
}
