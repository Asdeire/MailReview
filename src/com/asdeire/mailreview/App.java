package com.asdeire.mailreview;

import com.asdeire.mailreview.entity.MailReview;
import com.asdeire.mailreview.entity.MailUser;
import com.asdeire.mailreview.tools.MailReviewService;

import java.util.List;
import java.util.Scanner;

/**
 * Main application class for collecting mail reviews from users.
 */
public class App {

    /**
     * Entry point of the application.
     *
     * <p>This program collects feedback from users, creates a mail review, and adds it to the system.
     * It then retrieves and prints all mail reviews.</p>
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your email: ");
        String emailAddress = scanner.nextLine();
        System.out.println("Password: ");
        String hashedPassword = scanner.nextLine();
        System.out.println("Your feedback: ");
        String feedback = scanner.nextLine();

        MailUser mailUser = new MailUser(emailAddress, hashedPassword);
        MailReview mailReview = new MailReview(mailUser, feedback);

        MailReviewService mailReviewService = new MailReviewService();

        mailReviewService.addMailReview(mailReview);

        List<MailReview> allMailReviews = mailReviewService.getAllMailReviews();
        for (MailReview r : allMailReviews) {
            System.out.println("User: " + r.getMailUser().getEmailAddress());
            System.out.println("Feedback: " + r.getFeedback());
            System.out.println("-----");
        }
    }
}
