package com.yousdi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageEntity {

    private Integer id;
    private String company;
    private String person;
    private String phone;
    private String email;
    private String content;
    private Integer isShow;
    private Integer isCall;
    private LocalDateTime addTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof MessageEntity)) {
            return false;
        } else {
            MessageEntity other = (MessageEntity)o;
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

                Object this$isCall = this.getIsCall();
                Object other$isCall = other.getIsCall();
                if (this$isCall == null) {
                    if (other$isCall != null) {
                        return false;
                    }
                } else if (!this$isCall.equals(other$isCall)) {
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

                Object this$person = this.getPerson();
                Object other$person = other.getPerson();
                if (this$person == null) {
                    if (other$person != null) {
                        return false;
                    }
                } else if (!this$person.equals(other$person)) {
                    return false;
                }

                Object this$phone = this.getPhone();
                Object other$phone = other.getPhone();
                if (this$phone == null) {
                    if (other$phone != null) {
                        return false;
                    }
                } else if (!this$phone.equals(other$phone)) {
                    return false;
                }

                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email != null) {
                        return false;
                    }
                } else if (!this$email.equals(other$email)) {
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

                Object this$addTime = this.getAddTime();
                Object other$addTime = other.getAddTime();
                if (this$addTime == null) {
                    if (other$addTime != null) {
                        return false;
                    }
                } else if (!this$addTime.equals(other$addTime)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof MessageEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $isShow = this.getIsShow();
        result = result * 59 + ($isShow == null ? 43 : $isShow.hashCode());
        Object $isCall = this.getIsCall();
        result = result * 59 + ($isCall == null ? 43 : $isCall.hashCode());
        Object $company = this.getCompany();
        result = result * 59 + ($company == null ? 43 : $company.hashCode());
        Object $person = this.getPerson();
        result = result * 59 + ($person == null ? 43 : $person.hashCode());
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        return result;
    }

    public String toString() {
        return "Message(id=" + this.getId() + ", company=" + this.getCompany() + ", person=" + this.getPerson() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", content=" + this.getContent() + ", isShow=" + this.getIsShow() + ", isCall=" + this.getIsCall() + ", addTime=" + this.getAddTime() + ")";
    }

    public MessageEntity() {
    }

    public MessageEntity(Integer id, String company, String person, String phone, String email, String content, Integer isShow, Integer isCall, LocalDateTime addTime) {
        this.id = id;
        this.company = company;
        this.person = person;
        this.phone = phone;
        this.email = email;
        this.content = content;
        this.isShow = isShow;
        this.isCall = isCall;
        this.addTime = addTime;
    }
}
