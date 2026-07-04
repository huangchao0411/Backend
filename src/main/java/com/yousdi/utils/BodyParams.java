package com.yousdi.utils;

import lombok.Data;

@Data
public class BodyParams {

    private String file;
    private String name;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BodyParams)) {
            return false;
        } else {
            BodyParams other = (BodyParams)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$file = this.getFile();
                Object other$file = other.getFile();
                if (this$file == null) {
                    if (other$file != null) {
                        return false;
                    }
                } else if (!this$file.equals(other$file)) {
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

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BodyParams;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $file = this.getFile();
        result = result * 59 + ($file == null ? 43 : $file.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "BodyParams(file=" + this.getFile() + ", name=" + this.getName() + ")";
    }

    public BodyParams(String file, String name) {
        this.file = file;
        this.name = name;
    }

    public BodyParams() {
    }
}
