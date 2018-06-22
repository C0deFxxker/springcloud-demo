package com.lyl.study.springcloud.feign.client;

import java.util.Date;

public class RequestForm {
    private String name;
    private Date time;

    public String getName() {
        return name;
    }

    public RequestForm setName(String name) {
        this.name = name;
        return this;
    }

    public Date getTime() {
        return time;
    }

    public RequestForm setTime(Date time) {
        this.time = time;
        return this;
    }
}
