package com.newt.boot.common.request;

import java.io.Serializable;

public class FaultImgInfo implements Serializable {

    private static final long serialVersionUID = 2919734460445849504L;

    private String path;

    private String oriName;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getOriName() {
        return oriName;
    }

    public void setOriName(String oriName) {
        this.oriName = oriName;
    }
}
