package com.newt.boot.common.request;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class FallQueryRequest implements Serializable {
    private static final long serialVersionUID = -512881059581249394L;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date boltTime;

    private Integer pageSize;

    public Date getBoltTime() {
        return boltTime;
    }

    public void setBoltTime(Date boltTime) {
        this.boltTime = boltTime;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
