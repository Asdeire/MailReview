package com.asdeire.mailreview.tools;

import com.asdeire.mailreview.entity.MailReview;
import com.asdeire.mailreview.data_access.FileHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class for managing mail review operations.
 *
 * <p>This class provides functionality for adding and retrieving mail reviews, interacting with the file system
 * for persistent storage.</p>
 */
public class MailReviewService {

    /**
     * The list of mail reviews.
     */
    private List<MailReview> mailReviews;

    /**
     * Constructs a new MailReviewService instance.
     * <p>
     * This constructor initializes the list of mail reviews by reading from a JSON file.
     * If the file does not exist or an error occurs during reading, it creates a new empty list.
     * </p>
     */
    public MailReviewService() {
        mailReviews = (List<MailReview>) FileHandler.readFromFile("mailReviews.json");
        if (mailReviews == null) {
            mailReviews = new ArrayList<>();
        }
    }

    /**
     * Adds a new mail review to the list of reviews and saves the updated list to a JSON file.
     *
     * @param mailReview The mail review to be added.
     */
    public void addMailReview(MailReview mailReview) {
        mailReviews.add(mailReview);
        FileHandler.writeToFile("mailReviews.json", mailReviews);
    }

    /**
     * Retrieves a copy of the list of all mail reviews.
     *
     * @return A list containing all mail reviews.
     */
    public List<MailReview> getAllMailReviews() {
        return new ArrayList<>(mailReviews);
    }

}
