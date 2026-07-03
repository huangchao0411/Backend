package com.yousdi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Case {

    private Integer id;
    private String title;
    private Integer categoryID;
    private String categoryName;
    private String subTitle;
    private String img;
    private Integer isShow;
    private String zhaiyao;
    private String content;
    private String mbcontent;
    private Integer sortID;
    private String SEOTitle;
    private String SEOKeywords;
    private String SEODescription;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Case)) {
            return false;
        } else {
            Case other = (Case)o;
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

                Object this$title = this.getTitle();
                Object other$title = other.getTitle();
                if (this$title == null) {
                    if (other$title != null) {
                        return false;
                    }
                } else if (!this$title.equals(other$title)) {
                    return false;
                }

                Object this$categoryName = this.getCategoryName();
                Object other$categoryName = other.getCategoryName();
                if (this$categoryName == null) {
                    if (other$categoryName != null) {
                        return false;
                    }
                } else if (!this$categoryName.equals(other$categoryName)) {
                    return false;
                }

                Object this$subTitle = this.getSubTitle();
                Object other$subTitle = other.getSubTitle();
                if (this$subTitle == null) {
                    if (other$subTitle != null) {
                        return false;
                    }
                } else if (!this$subTitle.equals(other$subTitle)) {
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

                Object this$zhaiyao = this.getZhaiyao();
                Object other$zhaiyao = other.getZhaiyao();
                if (this$zhaiyao == null) {
                    if (other$zhaiyao != null) {
                        return false;
                    }
                } else if (!this$zhaiyao.equals(other$zhaiyao)) {
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

                Object this$mbcontent = this.getMbcontent();
                Object other$mbcontent = other.getMbcontent();
                if (this$mbcontent == null) {
                    if (other$mbcontent != null) {
                        return false;
                    }
                } else if (!this$mbcontent.equals(other$mbcontent)) {
                    return false;
                }

                Object this$SEOTitle = this.getSEOTitle();
                Object other$SEOTitle = other.getSEOTitle();
                if (this$SEOTitle == null) {
                    if (other$SEOTitle != null) {
                        return false;
                    }
                } else if (!this$SEOTitle.equals(other$SEOTitle)) {
                    return false;
                }

                Object this$SEOKeywords = this.getSEOKeywords();
                Object other$SEOKeywords = other.getSEOKeywords();
                if (this$SEOKeywords == null) {
                    if (other$SEOKeywords != null) {
                        return false;
                    }
                } else if (!this$SEOKeywords.equals(other$SEOKeywords)) {
                    return false;
                }

                Object this$SEODescription = this.getSEODescription();
                Object other$SEODescription = other.getSEODescription();
                if (this$SEODescription == null) {
                    if (other$SEODescription != null) {
                        return false;
                    }
                } else if (!this$SEODescription.equals(other$SEODescription)) {
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
        return other instanceof Case;
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
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $categoryName = this.getCategoryName();
        result = result * 59 + ($categoryName == null ? 43 : $categoryName.hashCode());
        Object $subTitle = this.getSubTitle();
        result = result * 59 + ($subTitle == null ? 43 : $subTitle.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $zhaiyao = this.getZhaiyao();
        result = result * 59 + ($zhaiyao == null ? 43 : $zhaiyao.hashCode());
        Object $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        Object $mbcontent = this.getMbcontent();
        result = result * 59 + ($mbcontent == null ? 43 : $mbcontent.hashCode());
        Object $SEOTitle = this.getSEOTitle();
        result = result * 59 + ($SEOTitle == null ? 43 : $SEOTitle.hashCode());
        Object $SEOKeywords = this.getSEOKeywords();
        result = result * 59 + ($SEOKeywords == null ? 43 : $SEOKeywords.hashCode());
        Object $SEODescription = this.getSEODescription();
        result = result * 59 + ($SEODescription == null ? 43 : $SEODescription.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "Case(id=" + this.getId() + ", title=" + this.getTitle() + ", categoryID=" + this.getCategoryID() + ", categoryName=" + this.getCategoryName() + ", subTitle=" + this.getSubTitle() + ", img=" + this.getImg() + ", isShow=" + this.getIsShow() + ", zhaiyao=" + this.getZhaiyao() + ", content=" + this.getContent() + ", mbcontent=" + this.getMbcontent() + ", sortID=" + this.getSortID() + ", SEOTitle=" + this.getSEOTitle() + ", SEOKeywords=" + this.getSEOKeywords() + ", SEODescription=" + this.getSEODescription() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public Case(Integer id, String title, Integer categoryID, String categoryName, String subTitle, String img, Integer isShow, String zhaiyao, String content, String mbcontent, Integer sortID, String SEOTitle, String SEOKeywords, String SEODescription, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.title = title;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.subTitle = subTitle;
        this.img = img;
        this.isShow = isShow;
        this.zhaiyao = zhaiyao;
        this.content = content;
        this.mbcontent = mbcontent;
        this.sortID = sortID;
        this.SEOTitle = SEOTitle;
        this.SEOKeywords = SEOKeywords;
        this.SEODescription = SEODescription;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }

    public Case() {
    }
}
