package com.yousdi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Process {

    private Integer id;
    private String title;
    private String name;
    private String content;
    private String img;
    private Short isShow;
    private Short sortID;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Process)) {
            return false;
        } else {
            Process other = (Process)o;
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
        return other instanceof Process;
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
        return "Process(id=" + this.getId() + ", title=" + this.getTitle() + ", name=" + this.getName() + ", content=" + this.getContent() + ", img=" + this.getImg() + ", isShow=" + this.getIsShow() + ", sortID=" + this.getSortID() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public Process(Integer id, String title, String name, String content, String img, Short isShow, Short sortID, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.content = content;
        this.img = img;
        this.isShow = isShow;
        this.sortID = sortID;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }

    public Process() {
    }
}
