package com.yousdi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CaseImgEntity {

    private Integer id;
    private Integer categoryID;
    private String img;
    private Short isShow;
    private Integer sortID;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CaseImgEntity)) {
            return false;
        } else {
            CaseImgEntity other = (CaseImgEntity)o;
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

                Object this$categoryID = this.getCategoryID();
                Object other$categoryID = other.getCategoryID();
                if (this$categoryID == null) {
                    if (other$categoryID != null) {
                        return false;
                    }
                } else if (!this$categoryID.equals(other$categoryID)) {
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
        return other instanceof CaseImgEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $categoryID = this.getCategoryID();
        result = result * 59 + ($categoryID == null ? 43 : $categoryID.hashCode());
        Object $isShow = this.getIsShow();
        result = result * 59 + ($isShow == null ? 43 : $isShow.hashCode());
        Object $sortID = this.getSortID();
        result = result * 59 + ($sortID == null ? 43 : $sortID.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "CaseImg(id=" + this.getId() + ", categoryID=" + this.getCategoryID() + ", img=" + this.getImg() + ", isShow=" + this.getIsShow() + ", sortID=" + this.getSortID() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public CaseImgEntity(Integer id, Integer categoryID, String img, Short isShow, Integer sortID, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.categoryID = categoryID;
        this.img = img;
        this.isShow = isShow;
        this.sortID = sortID;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }

    public CaseImgEntity() {
    }
}
