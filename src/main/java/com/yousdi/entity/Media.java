package com.yousdi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Media {

    private Integer id;
    private String name;
    private String url;
    private String img;
    private Integer isShow;
    private Integer sortID;
    private LocalDateTime updateTime;
    private LocalDateTime addTime;
    private Integer isShare;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Media)) {
            return false;
        } else {
            Media other = (Media)o;
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

                Object this$isShow = this.getIsShow();
                Object other$isShow = other.getIsShow();
                if (this$isShow == null) {
                    if (other$isShow != null) {
                        return false;
                    }
                } else if (!this$isShow.equals(other$isShow)) {
                    return false;
                }

                Object this$sortID = this.getSortID();
                Object other$sortID = other.getSortID();
                if (this$sortID == null) {
                    if (other$sortID != null) {
                        return false;
                    }
                } else if (!this$sortID.equals(other$sortID)) {
                    return false;
                }

                Object this$isShare = this.getIsShare();
                Object other$isShare = other.getIsShare();
                if (this$isShare == null) {
                    if (other$isShare != null) {
                        return false;
                    }
                } else if (!this$isShare.equals(other$isShare)) {
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

                Object this$url = this.getUrl();
                Object other$url = other.getUrl();
                if (this$url == null) {
                    if (other$url != null) {
                        return false;
                    }
                } else if (!this$url.equals(other$url)) {
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

                Object this$updateTime = this.getUpdateTime();
                Object other$updateTime = other.getUpdateTime();
                if (this$updateTime == null) {
                    if (other$updateTime != null) {
                        return false;
                    }
                } else if (!this$updateTime.equals(other$updateTime)) {
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

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Media;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $isShow = this.getIsShow();
        result = result * 59 + ($isShow == null ? 43 : $isShow.hashCode());
        Object $sortID = this.getSortID();
        result = result * 59 + ($sortID == null ? 43 : $sortID.hashCode());
        Object $isShare = this.getIsShare();
        result = result * 59 + ($isShare == null ? 43 : $isShare.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        return result;
    }

    public String toString() {
        return "Media(id=" + this.getId() + ", name=" + this.getName() + ", url=" + this.getUrl() + ", img=" + this.getImg() + ", isShow=" + this.getIsShow() + ", sortID=" + this.getSortID() + ", updateTime=" + this.getUpdateTime() + ", addTime=" + this.getAddTime() + ", isShare=" + this.getIsShare() + ")";
    }

    public Media() {
    }

    public Media(Integer id, String name, String url, String img, Integer isShow, Integer sortID, LocalDateTime updateTime, LocalDateTime addTime, Integer isShare) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.img = img;
        this.isShow = isShow;
        this.sortID = sortID;
        this.updateTime = updateTime;
        this.addTime = addTime;
        this.isShare = isShare;
    }
}
