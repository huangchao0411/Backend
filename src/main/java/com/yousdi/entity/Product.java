package com.yousdi.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Product implements Serializable {

    private Integer id;
    private Integer categoryID;
    private String categoryName;
    private String title;
    private String video;
    private String img;
    private String subtitle;
    private String zhaiyao;
    private String params;
    private String content;
    private String mbcontent;
    private Integer sortID;
    private Integer isHot;
    private String SEOTitle;
    private String SEOKeyWord;
    private String SEODescription;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Product)) {
            return false;
        } else {
            Product other = (Product)o;
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

                Object this$sortID = this.getSortID();
                Object other$sortID = other.getSortID();
                if (this$sortID == null) {
                    if (other$sortID != null) {
                        return false;
                    }
                } else if (!this$sortID.equals(other$sortID)) {
                    return false;
                }

                Object this$isHot = this.getIsHot();
                Object other$isHot = other.getIsHot();
                if (this$isHot == null) {
                    if (other$isHot != null) {
                        return false;
                    }
                } else if (!this$isHot.equals(other$isHot)) {
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

                Object this$title = this.getTitle();
                Object other$title = other.getTitle();
                if (this$title == null) {
                    if (other$title != null) {
                        return false;
                    }
                } else if (!this$title.equals(other$title)) {
                    return false;
                }

                Object this$video = this.getVideo();
                Object other$video = other.getVideo();
                if (this$video == null) {
                    if (other$video != null) {
                        return false;
                    }
                } else if (!this$video.equals(other$video)) {
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

                Object this$subtitle = this.getSubtitle();
                Object other$subtitle = other.getSubtitle();
                if (this$subtitle == null) {
                    if (other$subtitle != null) {
                        return false;
                    }
                } else if (!this$subtitle.equals(other$subtitle)) {
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

                Object this$params = this.getParams();
                Object other$params = other.getParams();
                if (this$params == null) {
                    if (other$params != null) {
                        return false;
                    }
                } else if (!this$params.equals(other$params)) {
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

                Object this$SEOKeyWord = this.getSEOKeyWord();
                Object other$SEOKeyWord = other.getSEOKeyWord();
                if (this$SEOKeyWord == null) {
                    if (other$SEOKeyWord != null) {
                        return false;
                    }
                } else if (!this$SEOKeyWord.equals(other$SEOKeyWord)) {
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
        return other instanceof Product;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $categoryID = this.getCategoryID();
        result = result * 59 + ($categoryID == null ? 43 : $categoryID.hashCode());
        Object $sortID = this.getSortID();
        result = result * 59 + ($sortID == null ? 43 : $sortID.hashCode());
        Object $isHot = this.getIsHot();
        result = result * 59 + ($isHot == null ? 43 : $isHot.hashCode());
        Object $categoryName = this.getCategoryName();
        result = result * 59 + ($categoryName == null ? 43 : $categoryName.hashCode());
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $video = this.getVideo();
        result = result * 59 + ($video == null ? 43 : $video.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $subtitle = this.getSubtitle();
        result = result * 59 + ($subtitle == null ? 43 : $subtitle.hashCode());
        Object $zhaiyao = this.getZhaiyao();
        result = result * 59 + ($zhaiyao == null ? 43 : $zhaiyao.hashCode());
        Object $params = this.getParams();
        result = result * 59 + ($params == null ? 43 : $params.hashCode());
        Object $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        Object $mbcontent = this.getMbcontent();
        result = result * 59 + ($mbcontent == null ? 43 : $mbcontent.hashCode());
        Object $SEOTitle = this.getSEOTitle();
        result = result * 59 + ($SEOTitle == null ? 43 : $SEOTitle.hashCode());
        Object $SEOKeyWord = this.getSEOKeyWord();
        result = result * 59 + ($SEOKeyWord == null ? 43 : $SEOKeyWord.hashCode());
        Object $SEODescription = this.getSEODescription();
        result = result * 59 + ($SEODescription == null ? 43 : $SEODescription.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "Product(id=" + this.getId() + ", categoryID=" + this.getCategoryID() + ", categoryName=" + this.getCategoryName() + ", title=" + this.getTitle() + ", video=" + this.getVideo() + ", img=" + this.getImg() + ", subtitle=" + this.getSubtitle() + ", zhaiyao=" + this.getZhaiyao() + ", params=" + this.getParams() + ", content=" + this.getContent() + ", mbcontent=" + this.getMbcontent() + ", sortID=" + this.getSortID() + ", isHot=" + this.getIsHot() + ", SEOTitle=" + this.getSEOTitle() + ", SEOKeyWord=" + this.getSEOKeyWord() + ", SEODescription=" + this.getSEODescription() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public Product(Integer id, Integer categoryID, String categoryName, String title, String video, String img, String subtitle, String zhaiyao, String params, String content, String mbcontent, Integer sortID, Integer isHot, String SEOTitle, String SEOKeyWord, String SEODescription, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.title = title;
        this.video = video;
        this.img = img;
        this.subtitle = subtitle;
        this.zhaiyao = zhaiyao;
        this.params = params;
        this.content = content;
        this.mbcontent = mbcontent;
        this.sortID = sortID;
        this.isHot = isHot;
        this.SEOTitle = SEOTitle;
        this.SEOKeyWord = SEOKeyWord;
        this.SEODescription = SEODescription;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }

    public Product() {
    }
}
