package com.asdeire.mailreview.entity;

import java.io.Serializable;

/**
 * Represents a user's review for a specific mail.
 *
 * <p>Instances of this class store information about the mail user, feedback, and other details.</p>
 */
public class MailReview implements Serializable{

    /**
     * The mail user who wrote the review.
     */
    private MailUser mailUser;

    /**
     * The feedback provided by the user.
     */
    private String feedback;

    public MailReview(){}

    /**
     * Constructs a new MailReview instance with the given user and feedback.
     *
     * @param mailUser The mail user who wrote the review.
     * @param feedback The feedback provided by the user.
     */
    public MailReview(MailUser mailUser, String feedback) {
        this.mailUser = mailUser;
        this.feedback = feedback;
    }

    /**
     * Gets the mail user associated with this review.
     *
     * @return The mail user.
     */
    public MailUser getMailUser() {
        return mailUser;
    }

    /**
     * Gets the feedback provided in this review.
     *
     * @return The feedback.
     */
    public String getFeedback() {
        return feedback;
    }
}
