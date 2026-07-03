package com.yousdi.entity;

import lombok.Data;

@Data
public class Role {

    private Integer id;
    private String name;
    private String desc;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Role)) {
            return false;
        } else {
            Role other = (Role)o;
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

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                Object this$desc = this.getDesc();
                Object other$desc = other.getDesc();
                if (this$desc == null) {
                    if (other$desc != null) {
                        return false;
                    }
                } else if (!this$desc.equals(other$desc)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Role;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $desc = this.getDesc();
        result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
        return result;
    }

    public String toString() {
        return "Role(id=" + this.getId() + ", name=" + this.getName() + ", desc=" + this.getDesc() + ")";
    }

    public Role() {
    }

    public Role(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }
}
