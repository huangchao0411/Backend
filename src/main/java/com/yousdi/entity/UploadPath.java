package com.yousdi.entity;

import lombok.Data;

@Data
public class UploadPath {

    private String url;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof UploadPath)) {
            return false;
        } else {
            UploadPath other = (UploadPath)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$url = this.getUrl();
                Object other$url = other.getUrl();
                if (this$url == null) {
                    if (other$url != null) {
                        return false;
                    }
                } else if (!this$url.equals(other$url)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof UploadPath;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        return result;
    }

    public String toString() {
        return "UploadPath(url=" + this.getUrl() + ")";
    }
}
