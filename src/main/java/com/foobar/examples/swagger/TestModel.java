package com.foobar.examples.swagger;

import java.util.Date;

/**
 * Created by Michael on 2016/6/26.
 */
public class TestModel {

    private Date echoTime;
    private String echoMessage;

    public TestModel() {
    }

    public TestModel(Date echoTime, String echoMessage) {
        this.echoTime = echoTime;
        this.echoMessage = echoMessage;
    }

    public Date getEchoTime() {
        return echoTime;
    }

    public void setEchoTime(Date echoTime) {
        this.echoTime = echoTime;
    }

    public String getEchoMessage() {
        return echoMessage;
    }

    public void setEchoMessage(String echoMessage) {
        this.echoMessage = echoMessage;
    }
}
