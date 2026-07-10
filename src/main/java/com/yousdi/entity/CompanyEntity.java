package com.yousdi.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("company")
public class CompanyEntity implements Serializable {

    private Integer id;
    private Integer cateId;
    private String name;
    private String title;
    private String zhaiyao;
    private String subContent;
    private String content;
    private String mbcontent;
    private String img;
    private String mbimg;
    private String case1;
    private String case2;
    private String case3;
    private String person;
    private String job;
    private String pimg;
    private String history;
    private int sortID;
    private short isShow;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CompanyEntity)) {
            return false;
        } else {
            CompanyEntity other = (CompanyEntity)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getSortID() != other.getSortID()) {
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

                Object this$cateId = this.getCateId();
                Object other$cateId = other.getCateId();
                if (this$cateId == null) {
                    if (other$cateId != null) {
                        return false;
                    }
                } else if (!this$cateId.equals(other$cateId)) {
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

                Object this$title = this.getTitle();
                Object other$title = other.getTitle();
                if (this$title == null) {
                    if (other$title != null) {
                        return false;
                    }
                } else if (!this$title.equals(other$title)) {
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

                Object this$subContent = this.getSubContent();
                Object other$subContent = other.getSubContent();
                if (this$subContent == null) {
                    if (other$subContent != null) {
                        return false;
                    }
                } else if (!this$subContent.equals(other$subContent)) {
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

                Object this$person = this.getPerson();
                Object other$person = other.getPerson();
                if (this$person == null) {
                    if (other$person != null) {
                        return false;
                    }
                } else if (!this$person.equals(other$person)) {
                    return false;
                }

                Object this$job = this.getJob();
                Object other$job = other.getJob();
                if (this$job == null) {
                    if (other$job != null) {
                        return false;
                    }
                } else if (!this$job.equals(other$job)) {
                    return false;
                }

                Object this$pimg = this.getPimg();
                Object other$pimg = other.getPimg();
                if (this$pimg == null) {
                    if (other$pimg != null) {
                        return false;
                    }
                } else if (!this$pimg.equals(other$pimg)) {
                    return false;
                }

                Object this$history = this.getHistory();
                Object other$history = other.getHistory();
                if (this$history == null) {
                    if (other$history != null) {
                        return false;
                    }
                } else if (!this$history.equals(other$history)) {
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
        return other instanceof CompanyEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getSortID();
        result = result * 59 + this.getIsShow();
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $cateId = this.getCateId();
        result = result * 59 + ($cateId == null ? 43 : $cateId.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $zhaiyao = this.getZhaiyao();
        result = result * 59 + ($zhaiyao == null ? 43 : $zhaiyao.hashCode());
        Object $subContent = this.getSubContent();
        result = result * 59 + ($subContent == null ? 43 : $subContent.hashCode());
        Object $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        Object $mbcontent = this.getMbcontent();
        result = result * 59 + ($mbcontent == null ? 43 : $mbcontent.hashCode());
        Object $img = this.getImg();
        result = result * 59 + ($img == null ? 43 : $img.hashCode());
        Object $mbimg = this.getMbimg();
        result = result * 59 + ($mbimg == null ? 43 : $mbimg.hashCode());
        Object $case1 = this.getCase1();
        result = result * 59 + ($case1 == null ? 43 : $case1.hashCode());
        Object $case2 = this.getCase2();
        result = result * 59 + ($case2 == null ? 43 : $case2.hashCode());
        Object $case3 = this.getCase3();
        result = result * 59 + ($case3 == null ? 43 : $case3.hashCode());
        Object $person = this.getPerson();
        result = result * 59 + ($person == null ? 43 : $person.hashCode());
        Object $job = this.getJob();
        result = result * 59 + ($job == null ? 43 : $job.hashCode());
        Object $pimg = this.getPimg();
        result = result * 59 + ($pimg == null ? 43 : $pimg.hashCode());
        Object $history = this.getHistory();
        result = result * 59 + ($history == null ? 43 : $history.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "Company(id=" + this.getId() + ", cateId=" + this.getCateId() + ", name=" + this.getName() + ", title=" + this.getTitle() + ", zhaiyao=" + this.getZhaiyao() + ", subContent=" + this.getSubContent() + ", content=" + this.getContent() + ", mbcontent=" + this.getMbcontent() + ", img=" + this.getImg() + ", mbimg=" + this.getMbimg() + ", case1=" + this.getCase1() + ", case2=" + this.getCase2() + ", case3=" + this.getCase3() + ", person=" + this.getPerson() + ", job=" + this.getJob() + ", pimg=" + this.getPimg() + ", history=" + this.getHistory() + ", sortID=" + this.getSortID() + ", isShow=" + this.getIsShow() + ", addTime=" + this.getAddTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public CompanyEntity(Integer id, Integer cateId, String name, String title, String zhaiyao, String subContent, String content, String mbcontent, String img, String mbimg, String case1, String case2, String case3, String person, String job, String pimg, String history, int sortID, short isShow, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.cateId = cateId;
        this.name = name;
        this.title = title;
        this.zhaiyao = zhaiyao;
        this.subContent = subContent;
        this.content = content;
        this.mbcontent = mbcontent;
        this.img = img;
        this.mbimg = mbimg;
        this.case1 = case1;
        this.case2 = case2;
        this.case3 = case3;
        this.person = person;
        this.job = job;
        this.pimg = pimg;
        this.history = history;
        this.sortID = sortID;
        this.isShow = isShow;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }

    public CompanyEntity() {
    }
}
