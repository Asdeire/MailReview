package com.asdeire.mailreview.entity;

import java.io.Serializable;

public class MailService implements Serializable {
    private String serviceName;

    public MailService(){}

    public MailService(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

}
