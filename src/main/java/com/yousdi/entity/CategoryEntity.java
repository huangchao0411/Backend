package com.yousdi.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CategoryEntity implements Serializable {

    private Integer id;
    private Integer channelID;
    private String channelName;
    private String title;
    private String name;
    private String img;
    private String mbimg;
    private String cimg;
    private String url;
    private String zhaiyao;
    private String content;
    private short isHeader;
    private short isFooter;
    private short isHot;
    private int hSortID;
    private int fSortID;
    private short isShow;
    private String SEOTitle;
    private String SEOKeywords;
    private String SEODescription;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CategoryEntity)) {
            return false;
        } else {
            CategoryEntity other = (CategoryEntity)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getIsHeader() != other.getIsHeader()) {
                return false;
            } else if (this.getIsFooter() != other.getIsFooter()) {
                return false;
            } else if (this.getIsHot() != other.getIsHot()) {
                return false;
            } else if (this.getHSortID() != other.getHSortID()) {
                return false;
            } else if (this.getFSortID() != other.getFSortID()) {
                return false;
            } else if (this.getIsShow() != other.getIsShow()) {
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

                Object this$channelID = this.getChannelID();
                Object other$channelID = other.getChannelID();
                if (this$channelID == null) {
                    if (other$channelID != null) {
                        return false;
                    }
                } else if (!this$channelID.equals(other$channelID)) {
                    return false;
                }

                Object this$channelName = this.getChannelName();
                Object other$channelName = other.getChannelName();
                if (this$channelName == null) {
                    if (other$channelName != null) {
                        return false;
                    }
                } else if (!this$channelName.equals(other$channelName)) {
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

                Object this$cimg = this.getCimg();
                Object other$cimg = other.getCimg();
                if (this$cimg == null) {
                    if (other$cimg != null) {
                        return false;
                    }
                } else if (!this$cimg.equals(other$cimg)) {
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
        return other instanceof CategoryEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getIsHeader();
        result = result * 59 + this.getIsFooter();
        result = result * 59 + this.getIsHot();
        result = result * 59 + this.getHSortID();
        result = result * 59 + this.getFSortID();
        result = result * 59 + this.getIsShow();
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $channelID = this.getChannelID();
        result = result * 59 + ($channelID == null ? 43 : $channelID.hashCode());
        Object $channelName = this.getChannelName();
        result = result * 59 + ($channelName == null ? 43 : $channelName.hashCode());
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $mbimg = this.getMbimg();
        result = result * 59 + ($mbimg == null ? 43 : $mbimg.hashCode());
        Object $cimg = this.getCimg();
        result = result * 59 + ($cimg == null ? 43 : $cimg.hashCode());
        Object $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        Object $zhaiyao = this.getZhaiyao();
        result = result * 59 + ($zhaiyao == null ? 43 : $zhaiyao.hashCode());
        Object $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
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
        return "Category(id=" + this.getId() + ", channelID=" + this.getChannelID() + ", channelName=" + this.getChannelName() + ", title=" + this.getTitle() + ", name=" + this.getName() + ", img=" + this.getImg() + ", mbimg=" + this.getMbimg() + ", cimg=" + this.getCimg() + ", url=" + this.getUrl() + ", zhaiyao=" + this.getZhaiyao() + ", content=" + this.getContent() + ", isHeader=" + this.getIsHeader() + ", isFooter=" + this.getIsFooter() + ", isHot=" + this.getIsHot() + ", hSortID=" + this.getHSortID() + ", fSortID=" + this.getFSortID() + ", isShow=" + this.getIsShow() + ", SEOTitle=" + this.getSEOTitle() + ", SEOKeywords=" + this.getSEOKeywords() + ", SEODescription=" + this.getSEODescription() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public CategoryEntity(Integer id, Integer channelID, String channelName, String title, String name, String img, String mbimg, String cimg, String url, String zhaiyao, String content, short isHeader, short isFooter, short isHot, int hSortID, int fSortID, short isShow, String SEOTitle, String SEOKeywords, String SEODescription, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.channelID = channelID;
        this.channelName = channelName;
        this.title = title;
        this.name = name;
        this.img = img;
        this.mbimg = mbimg;
        this.cimg = cimg;
        this.url = url;
        this.zhaiyao = zhaiyao;
        this.content = content;
        this.isHeader = isHeader;
        this.isFooter = isFooter;
        this.isHot = isHot;
        this.hSortID = hSortID;
        this.fSortID = fSortID;
        this.isShow = isShow;
        this.SEOTitle = SEOTitle;
        this.SEOKeywords = SEOKeywords;
        this.SEODescription = SEODescription;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }

    public CategoryEntity() {
    }
}
