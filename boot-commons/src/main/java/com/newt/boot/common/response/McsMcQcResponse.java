package com.newt.boot.common.response;

import java.io.Serializable;
import java.util.List;

public class McsMcQcResponse implements Serializable {
    private static final long serialVersionUID = -4291725176425895146L;

    private Integer canceled;

    private Integer finished;

    public McsMcQcResponse(){
        this.canceled = 0;
        this.finished = 0;
    }

    List<McsMcQcDto> qcList;

    public Integer getCanceled() {
        return canceled;
    }

    public void setCanceled(Integer canceled) {
        this.canceled = canceled;
    }

    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public List<McsMcQcDto> getQcList() {
        return qcList;
    }

    public void setQcList(List<McsMcQcDto> qcList) {
        this.qcList = qcList;
    }
}
