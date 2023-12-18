package com.asdeire.mailreview.tools;

import com.asdeire.mailreview.entity.MailReview;
import com.asdeire.mailreview.data_access.FileHandler;
import java.util.*;

public class MailReviewService {
    private List<MailReview> mailReviews;

    public MailReviewService() {
        mailReviews = (List<MailReview>) FileHandler.readFromFile("mailReviews.json");
        if (mailReviews == null) {
            mailReviews = new ArrayList<>();
        }
    }

    public void addMailReview(MailReview mailReview) {
        mailReviews.add(mailReview);
        FileHandler.writeToFile("mailReviews.json", mailReviews);
    }

    public List<MailReview> getAllMailReviews() {
        return new ArrayList<>(mailReviews);
    }

}

