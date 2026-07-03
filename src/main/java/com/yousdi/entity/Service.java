package com.yousdi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Service {

    private int id;
    private int categoryID;
    private String title;
    private String name;
    private String content;
    private String img;
    private Short isShow;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Service)) {
            return false;
        } else {
            Service other = (Service)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId() != other.getId()) {
                return false;
            } else if (this.getCategoryID() != other.getCategoryID()) {
                return false;
            } else {
                Object this$isShow = this.getIsShow();
                Object other$isShow = other.getIsShow();
                if (this$isShow == null) {
                    if (other$isShow != null) {
                        return false;
                    }
                } else if (!this$isShow.equals(other$isShow)) {
                    return false;
                }

                Object this$title = this.getTitle();
                Object other$title = other.getTitle();
                if (this$title == null) {
                    if (other$title != null) {
                        return false;
                    }
                } else if (!this$title.equals(other$title)) {
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

                Object this$content = this.getContent();
                Object other$content = other.getContent();
                if (this$content == null) {
                    if (other$content != null) {
                        return false;
                    }
                } else if (!this$content.equals(other$content)) {
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
        return other instanceof Service;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getCategoryID();
        Object $isShow = this.getIsShow();
        result = result * 59 + ($isShow == null ? 43 : $isShow.hashCode());
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "Service(id=" + this.getId() + ", categoryID=" + this.getCategoryID() + ", title=" + this.getTitle() + ", name=" + this.getName() + ", content=" + this.getContent() + ", img=" + this.getImg() + ", isShow=" + this.getIsShow() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public Service() {
    }

    public Service(int id, int categoryID, String title, String name, String content, String img, Short isShow, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.categoryID = categoryID;
        this.title = title;
        this.name = name;
        this.content = content;
        this.img = img;
        this.isShow = isShow;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }
}
