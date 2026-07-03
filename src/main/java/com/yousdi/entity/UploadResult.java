package com.yousdi.entity;

import lombok.Data;

@Data
public class UploadResult {

    private Integer code;
    private Integer errno;
    private String msg;
    private Object data;

    public static UploadResult success(Object data) {
        return new UploadResult(1, 0, "success", data);
    }

    public static UploadResult success() {
        return new UploadResult(1, 0, "success", (Object)null);
    }

    public static UploadResult error(String msg) {
        return new UploadResult(0, 1, msg, (Object)null);
    }

    public String toString() {
        return " Result { code = " + this.errno + ", msg = '" + this.msg + '\'' + ", data = " + this.data + '}';
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof UploadResult)) {
            return false;
        } else {
            UploadResult other = (UploadResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                Object this$errno = this.getErrno();
                Object other$errno = other.getErrno();
                if (this$errno == null) {
                    if (other$errno != null) {
                        return false;
                    }
                } else if (!this$errno.equals(other$errno)) {
                    return false;
                }

                Object this$msg = this.getMsg();
                Object other$msg = other.getMsg();
                if (this$msg == null) {
                    if (other$msg != null) {
                        return false;
                    }
                } else if (!this$msg.equals(other$msg)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof UploadResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $errno = this.getErrno();
        result = result * 59 + ($errno == null ? 43 : $errno.hashCode());
        Object $msg = this.getMsg();
        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public UploadResult() {
    }

    public UploadResult(Integer code, Integer errno, String msg, Object data) {
        this.code = code;
        this.errno = errno;
        this.msg = msg;
        this.data = data;
    }
}
