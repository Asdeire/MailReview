package com.asdeire.mailreview.entity;

import java.io.Serializable;
public class MailUser implements Serializable {
    private String emailAddress;
    private String hashedPassword;

    public MailUser(){}

    public MailUser(String emailAddress, String hashedPassword) {
        this.emailAddress = emailAddress;
        this.hashedPassword = hashedPassword;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}

