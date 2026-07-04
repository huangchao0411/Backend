package com.yousdi.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CarouselEntity implements Serializable {

    private Integer id;
    private String name;
    private String img;
    private String mbimg;
    private String url;
    private short isShow;
    private int sortID;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CarouselEntity)) {
            return false;
        } else {
            CarouselEntity other = (CarouselEntity)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getIsShow() != other.getIsShow()) {
                return false;
            } else if (this.getSortID() != other.getSortID()) {
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

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
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

                Object this$mbimg = this.getMbimg();
                Object other$mbimg = other.getMbimg();
                if (this$mbimg == null) {
                    if (other$mbimg != null) {
                        return false;
                    }
                } else if (!this$mbimg.equals(other$mbimg)) {
                    return false;
                }

                Object this$url = this.getUrl();
                Object other$url = other.getUrl();
                if (this$url == null) {
                    if (other$url != null) {
                        return false;
                    }
                } else if (!this$url.equals(other$url)) {
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
        return other instanceof CarouselEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getIsShow();
        result = result * 59 + this.getSortID();
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $mbimg = this.getMbimg();
        result = result * 59 + ($mbimg == null ? 43 : $mbimg.hashCode());
        Object $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "Carousel(id=" + this.getId() + ", name=" + this.getName() + ", img=" + this.getImg() + ", mbimg=" + this.getMbimg() + ", url=" + this.getUrl() + ", isShow=" + this.getIsShow() + ", sortID=" + this.getSortID() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public CarouselEntity() {
    }

    public CarouselEntity(Integer id, String name, String img, String mbimg, String url, short isShow, int sortID, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.mbimg = mbimg;
        this.url = url;
        this.isShow = isShow;
        this.sortID = sortID;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }
}
