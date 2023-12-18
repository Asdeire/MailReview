package com.asdeire.mailreview;

import com.asdeire.mailreview.entity.*;
import com.asdeire.mailreview.tools.MailReviewService;
import java.util.List;
import java.util.Scanner;

public class App {
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
