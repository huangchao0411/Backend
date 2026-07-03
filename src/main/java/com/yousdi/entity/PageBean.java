package com.yousdi.entity;

import lombok.Data;

@Data
public class PageBean {

    private Long total;
    private Object rows;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PageBean)) {
            return false;
        } else {
            PageBean other = (PageBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$total = this.getTotal();
                Object other$total = other.getTotal();
                if (this$total == null) {
                    if (other$total != null) {
                        return false;
                    }
                } else if (!this$total.equals(other$total)) {
                    return false;
                }

                Object this$rows = this.getRows();
                Object other$rows = other.getRows();
                if (this$rows == null) {
                    if (other$rows != null) {
                        return false;
                    }
                } else if (!this$rows.equals(other$rows)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PageBean;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $total = this.getTotal();
        result = result * 59 + ($total == null ? 43 : $total.hashCode());
        Object $rows = this.getRows();
        result = result * 59 + ($rows == null ? 43 : $rows.hashCode());
        return result;
    }

    public String toString() {
        return "PageBean(total=" + this.getTotal() + ", rows=" + this.getRows() + ")";
    }

    public PageBean() {
    }

    public PageBean(Long total, Object rows) {
        this.total = total;
        this.rows = rows;
    }
}
