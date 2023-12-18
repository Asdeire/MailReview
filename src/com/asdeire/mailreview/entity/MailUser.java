package com.asdeire.mailreview.entity;

import java.io.Serializable;
/**
 * Represents a mail user who can submit reviews.
 *
 * <p>Instances of this class store information about the user's email address and hashed password.</p>
 */
public class MailUser implements Serializable{

    /**
     * The email address of the mail user.
     */
    private String emailAddress;

    /**
     * The hashed password of the mail user.
     */
    private String hashedPassword;

    public MailUser(){}

    /**
     * Constructs a new MailUser instance with the given email address and hashed password.
     *
     * @param emailAddress The email address of the mail user.
     * @param hashedPassword The hashed password of the mail user.
     */
    public MailUser(String emailAddress, String hashedPassword) {
        this.emailAddress = emailAddress;
        this.hashedPassword = hashedPassword;
    }

    /**
     * Gets the email address of the mail user.
     *
     * @return The email address.
     */
    public String getEmailAddress() {
        return emailAddress;
    }
}

