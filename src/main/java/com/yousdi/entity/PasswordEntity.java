package com.yousdi.entity;

import lombok.Data;

@Data
public class PasswordEntity {

    private Integer id;
    private String oldPsd;
    private String newPsd;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PasswordEntity)) {
            return false;
        } else {
            PasswordEntity other = (PasswordEntity)o;
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

                Object this$oldPsd = this.getOldPsd();
                Object other$oldPsd = other.getOldPsd();
                if (this$oldPsd == null) {
                    if (other$oldPsd != null) {
                        return false;
                    }
                } else if (!this$oldPsd.equals(other$oldPsd)) {
                    return false;
                }

                Object this$newPsd = this.getNewPsd();
                Object other$newPsd = other.getNewPsd();
                if (this$newPsd == null) {
                    if (other$newPsd != null) {
                        return false;
                    }
                } else if (!this$newPsd.equals(other$newPsd)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PasswordEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $oldPsd = this.getOldPsd();
        result = result * 59 + ($oldPsd == null ? 43 : $oldPsd.hashCode());
        Object $newPsd = this.getNewPsd();
        result = result * 59 + ($newPsd == null ? 43 : $newPsd.hashCode());
        return result;
    }

    public String toString() {
        return "Password(id=" + this.getId() + ", oldPsd=" + this.getOldPsd() + ", newPsd=" + this.getNewPsd() + ")";
    }

    public PasswordEntity() {
    }

    public PasswordEntity(Integer id, String oldPsd, String newPsd) {
        this.id = id;
        this.oldPsd = oldPsd;
        this.newPsd = newPsd;
    }
}
