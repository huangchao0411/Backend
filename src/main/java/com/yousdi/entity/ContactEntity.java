package com.yousdi.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ContactEntity implements Serializable {

    private Integer id;
    private Integer categoryID;
    private String subtitle;
    private String title;
    private String img;
    private String case1;
    private String case2;
    private String case3;
    private String case4;
    private String case5;
    private String case6;
    private short sortID;
    private short isShow;
    private short isHot;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ContactEntity)) {
            return false;
        } else {
            ContactEntity other = (ContactEntity)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getSortID() != other.getSortID()) {
                return false;
            } else if (this.getIsShow() != other.getIsShow()) {
                return false;
            } else if (this.getIsHot() != other.getIsHot()) {
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

                Object this$subtitle = this.getSubtitle();
                Object other$subtitle = other.getSubtitle();
                if (this$subtitle == null) {
                    if (other$subtitle != null) {
                        return false;
                    }
                } else if (!this$subtitle.equals(other$subtitle)) {
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

                Object this$img = this.getImg();
                Object other$img = other.getImg();
                if (this$img == null) {
                    if (other$img != null) {
                        return false;
                    }
                } else if (!this$img.equals(other$img)) {
                    return false;
                }

                Object this$case1 = this.getCase1();
                Object other$case1 = other.getCase1();
                if (this$case1 == null) {
                    if (other$case1 != null) {
                        return false;
                    }
                } else if (!this$case1.equals(other$case1)) {
                    return false;
                }

                Object this$case2 = this.getCase2();
                Object other$case2 = other.getCase2();
                if (this$case2 == null) {
                    if (other$case2 != null) {
                        return false;
                    }
                } else if (!this$case2.equals(other$case2)) {
                    return false;
                }

                Object this$case3 = this.getCase3();
                Object other$case3 = other.getCase3();
                if (this$case3 == null) {
                    if (other$case3 != null) {
                        return false;
                    }
                } else if (!this$case3.equals(other$case3)) {
                    return false;
                }

                Object this$case4 = this.getCase4();
                Object other$case4 = other.getCase4();
                if (this$case4 == null) {
                    if (other$case4 != null) {
                        return false;
                    }
                } else if (!this$case4.equals(other$case4)) {
                    return false;
                }

                Object this$case5 = this.getCase5();
                Object other$case5 = other.getCase5();
                if (this$case5 == null) {
                    if (other$case5 != null) {
                        return false;
                    }
                } else if (!this$case5.equals(other$case5)) {
                    return false;
                }

                Object this$case6 = this.getCase6();
                Object other$case6 = other.getCase6();
                if (this$case6 == null) {
                    if (other$case6 != null) {
                        return false;
                    }
                } else if (!this$case6.equals(other$case6)) {
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
        return other instanceof ContactEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getSortID();
        result = result * 59 + this.getIsShow();
        result = result * 59 + this.getIsHot();
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $categoryID = this.getCategoryID();
        result = result * 59 + ($categoryID == null ? 43 : $categoryID.hashCode());
        Object $subtitle = this.getSubtitle();
        result = result * 59 + ($subtitle == null ? 43 : $subtitle.hashCode());
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $case1 = this.getCase1();
        result = result * 59 + ($case1 == null ? 43 : $case1.hashCode());
        Object $case2 = this.getCase2();
        result = result * 59 + ($case2 == null ? 43 : $case2.hashCode());
        Object $case3 = this.getCase3();
        result = result * 59 + ($case3 == null ? 43 : $case3.hashCode());
        Object $case4 = this.getCase4();
        result = result * 59 + ($case4 == null ? 43 : $case4.hashCode());
        Object $case5 = this.getCase5();
        result = result * 59 + ($case5 == null ? 43 : $case5.hashCode());
        Object $case6 = this.getCase6();
        result = result * 59 + ($case6 == null ? 43 : $case6.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "Contact(id=" + this.getId() + ", categoryID=" + this.getCategoryID() + ", subtitle=" + this.getSubtitle() + ", title=" + this.getTitle() + ", img=" + this.getImg() + ", case1=" + this.getCase1() + ", case2=" + this.getCase2() + ", case3=" + this.getCase3() + ", case4=" + this.getCase4() + ", case5=" + this.getCase5() + ", case6=" + this.getCase6() + ", sortID=" + this.getSortID() + ", isShow=" + this.getIsShow() + ", isHot=" + this.getIsHot() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public ContactEntity() {
    }

    public ContactEntity(Integer id, Integer categoryID, String subtitle, String title, String img, String case1, String case2, String case3, String case4, String case5, String case6, short sortID, short isShow, short isHot, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.categoryID = categoryID;
        this.subtitle = subtitle;
        this.title = title;
        this.img = img;
        this.case1 = case1;
        this.case2 = case2;
        this.case3 = case3;
        this.case4 = case4;
        this.case5 = case5;
        this.case6 = case6;
        this.sortID = sortID;
        this.isShow = isShow;
        this.isHot = isHot;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }
}
