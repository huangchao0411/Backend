package com.yousdi.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ChannelEntity implements Serializable {

    private Integer id;
    private String title;
    private String name;
    private String enname;
    private String subname;
    private String img;
    private String mbimg;
    private short isHeader;
    private short isFooter;
    private String url;
    private short isShow;
    private Integer sortID;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;
    private String SEOTitle;
    private String SEOKeywords;
    private String SEODescription;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ChannelEntity)) {
            return false;
        } else {
            ChannelEntity other = (ChannelEntity)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getIsHeader() != other.getIsHeader()) {
                return false;
            } else if (this.getIsFooter() != other.getIsFooter()) {
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

                Object this$enname = this.getEnname();
                Object other$enname = other.getEnname();
                if (this$enname == null) {
                    if (other$enname != null) {
                        return false;
                    }
                } else if (!this$enname.equals(other$enname)) {
                    return false;
                }

                Object this$subname = this.getSubname();
                Object other$subname = other.getSubname();
                if (this$subname == null) {
                    if (other$subname != null) {
                        return false;
                    }
                } else if (!this$subname.equals(other$subname)) {
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

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChannelEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getIsHeader();
        result = result * 59 + this.getIsFooter();
        result = result * 59 + this.getIsShow();
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $sortID = this.getSortID();
        result = result * 59 + ($sortID == null ? 43 : $sortID.hashCode());
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $enname = this.getEnname();
        result = result * 59 + ($enname == null ? 43 : $enname.hashCode());
        Object $subname = this.getSubname();
        result = result * 59 + ($subname == null ? 43 : $subname.hashCode());
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
        Object $SEOTitle = this.getSEOTitle();
        result = result * 59 + ($SEOTitle == null ? 43 : $SEOTitle.hashCode());
        Object $SEOKeywords = this.getSEOKeywords();
        result = result * 59 + ($SEOKeywords == null ? 43 : $SEOKeywords.hashCode());
        Object $SEODescription = this.getSEODescription();
        result = result * 59 + ($SEODescription == null ? 43 : $SEODescription.hashCode());
        return result;
    }

    public String toString() {
        return "Channel(id=" + this.getId() + ", title=" + this.getTitle() + ", name=" + this.getName() + ", enname=" + this.getEnname() + ", subname=" + this.getSubname() + ", img=" + this.getImg() + ", mbimg=" + this.getMbimg() + ", isHeader=" + this.getIsHeader() + ", isFooter=" + this.getIsFooter() + ", url=" + this.getUrl() + ", isShow=" + this.getIsShow() + ", sortID=" + this.getSortID() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ", SEOTitle=" + this.getSEOTitle() + ", SEOKeywords=" + this.getSEOKeywords() + ", SEODescription=" + this.getSEODescription() + ")";
    }

    public ChannelEntity(Integer id, String title, String name, String enname, String subname, String img, String mbimg, short isHeader, short isFooter, String url, short isShow, Integer sortID, LocalDateTime addTime, LocalDateTime updateTime, String SEOTitle, String SEOKeywords, String SEODescription) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.enname = enname;
        this.subname = subname;
        this.img = img;
        this.mbimg = mbimg;
        this.isHeader = isHeader;
        this.isFooter = isFooter;
        this.url = url;
        this.isShow = isShow;
        this.sortID = sortID;
        this.addTime = addTime;
        this.updateTime = updateTime;
        this.SEOTitle = SEOTitle;
        this.SEOKeywords = SEOKeywords;
        this.SEODescription = SEODescription;
    }

    public ChannelEntity() {
    }
}
