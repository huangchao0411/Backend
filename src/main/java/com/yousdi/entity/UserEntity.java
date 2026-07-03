package com.yousdi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserEntity {

    private Integer id;
    private String username;
    private String password;
    private Integer roleID;
    private String name;
    private String token;
    private short isLock;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof UserEntity)) {
            return false;
        } else {
            UserEntity other = (UserEntity)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getIsLock() != other.getIsLock()) {
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

                Object this$roleID = this.getRoleID();
                Object other$roleID = other.getRoleID();
                if (this$roleID == null) {
                    if (other$roleID != null) {
                        return false;
                    }
                } else if (!this$roleID.equals(other$roleID)) {
                    return false;
                }

                Object this$username = this.getUsername();
                Object other$username = other.getUsername();
                if (this$username == null) {
                    if (other$username != null) {
                        return false;
                    }
                } else if (!this$username.equals(other$username)) {
                    return false;
                }

                Object this$password = this.getPassword();
                Object other$password = other.getPassword();
                if (this$password == null) {
                    if (other$password != null) {
                        return false;
                    }
                } else if (!this$password.equals(other$password)) {
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

                Object this$token = this.getToken();
                Object other$token = other.getToken();
                if (this$token == null) {
                    if (other$token != null) {
                        return false;
                    }
                } else if (!this$token.equals(other$token)) {
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
        return other instanceof UserEntity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getIsLock();
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $roleID = this.getRoleID();
        result = result * 59 + ($roleID == null ? 43 : $roleID.hashCode());
        Object $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $token = this.getToken();
        result = result * 59 + ($token == null ? 43 : $token.hashCode());
        Object $addTime = this.getAddTime();
        result = result * 59 + ($addTime == null ? 43 : $addTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public UserEntity() {
    }

    public UserEntity(Integer id, String username, String password, Integer roleID, String name, String token, short isLock, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roleID = roleID;
        this.name = name;
        this.token = token;
        this.isLock = isLock;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }
}
