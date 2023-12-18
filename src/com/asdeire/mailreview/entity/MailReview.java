package com.asdeire.mailreview.entity;

import java.io.Serializable;

public class MailReview implements Serializable {
    private MailUser mailUser;
    private String feedback;

    public MailReview(){}

    public MailReview(MailUser mailUser, String feedback) {
        this.mailUser = mailUser;
        this.feedback = feedback;
    }

    public MailUser getMailUser() {
        return mailUser;
    }

    public String getFeedback() {
        return feedback;
    }
}

