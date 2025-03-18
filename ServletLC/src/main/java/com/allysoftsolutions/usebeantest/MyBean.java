package com.allysoftsolutions.usebeantest;

import java.io.Serializable;

public class MyBean implements Serializable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
