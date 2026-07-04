package com.yousdi.utils;

import lombok.Data;

@Data
public class PageResult {

    private Integer pageNo;
    private Integer pageSize;
    private Integer total;
    private Object data;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PageResult)) {
            return false;
        } else {
            PageResult other = (PageResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$pageNo = this.getPageNo();
                Object other$pageNo = other.getPageNo();
                if (this$pageNo == null) {
                    if (other$pageNo != null) {
                        return false;
                    }
                } else if (!this$pageNo.equals(other$pageNo)) {
                    return false;
                }

                Object this$pageSize = this.getPageSize();
                Object other$pageSize = other.getPageSize();
                if (this$pageSize == null) {
                    if (other$pageSize != null) {
                        return false;
                    }
                } else if (!this$pageSize.equals(other$pageSize)) {
                    return false;
                }

                Object this$total = this.getTotal();
                Object other$total = other.getTotal();
                if (this$total == null) {
                    if (other$total != null) {
                        return false;
                    }
                } else if (!this$total.equals(other$total)) {
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
        return other instanceof PageResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pageNo = this.getPageNo();
        result = result * 59 + ($pageNo == null ? 43 : $pageNo.hashCode());
        Object $pageSize = this.getPageSize();
        result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
        Object $total = this.getTotal();
        result = result * 59 + ($total == null ? 43 : $total.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "PageResult(pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", total=" + this.getTotal() + ", data=" + this.getData() + ")";
    }

    public PageResult() {
    }

    public PageResult(Integer pageNo, Integer pageSize, Integer total, Object data) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.total = total;
        this.data = data;
    }
}
