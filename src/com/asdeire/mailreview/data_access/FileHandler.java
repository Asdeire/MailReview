package com.asdeire.mailreview.data_access;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.asdeire.mailreview.entity.MailReview;

import java.io.*;
import java.util.*;

public class FileHandler {
    private static final ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    public static void writeToFile(String fileName, List<MailReview> dataList) {
        try {
            objectMapper.writeValue(new File(fileName), dataList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<MailReview> readFromFile(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            return objectMapper.readValue(file, new TypeReference<List<MailReview>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}




