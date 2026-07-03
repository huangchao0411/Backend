package com.yousdi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BeianEntity {

    private Integer id;
    private String title;
    private String beian;
    private String url;
    private String company;
    private String bqtime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BeianEntity)) {
            return false;
        } else {
            BeianEntity other = (BeianEntity)o;
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

                Object this$title = this.getTitle();
                Object other$title = other.getTitle();
                if (this$title == null) {
                    if (other$title != null) {
                        return false;
                    }
                } else if (!this$title.equals(other$title)) {
                    return false;
                }

                Object this$beian = this.getBeian();
                Object other$beian = other.getBeian();
                if (this$beian == null) {
                    if (other$beian != null) {
                        return false;
                    }
                } else if (!this$beian.equals(other$beian)) {
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

                Object this$company = this.getCompany();
                Object other$company = other.getCompany();
                if (this$company == null) {
                    if (other$company != null) {
                        return false;
                    }
                } else if (!this$company.equals(other$company)) {
                    return false;
                }

                Object this$bqtime = this.getBqtime();
                Object other$bqtime = other.getBqtime();
                if (this$bqtime == null) {
                    if (other$bqtime != null) {
                        return false;
                    }
                } else if (!this$bqtime.equals(other$bqtime)) {
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
        return other instanceof BeianEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $beian = this.getBeian();
        result = result * 59 + ($beian == null ? 43 : $beian.hashCode());
        Object $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        Object $company = this.getCompany();
        result = result * 59 + ($company == null ? 43 : $company.hashCode());
        Object $bqtime = this.getBqtime();
        result = result * 59 + ($bqtime == null ? 43 : $bqtime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "Beian(id=" + this.getId() + ", title=" + this.getTitle() + ", beian=" + this.getBeian() + ", url=" + this.getUrl() + ", company=" + this.getCompany() + ", bqtime=" + this.getBqtime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public BeianEntity() {
    }

    public BeianEntity(Integer id, String title, String beian, String url, String company, String bqtime, LocalDateTime updateTime) {
        this.id = id;
        this.title = title;
        this.beian = beian;
        this.url = url;
        this.company = company;
        this.bqtime = bqtime;
        this.updateTime = updateTime;
    }
}
