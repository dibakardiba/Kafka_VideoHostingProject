package com.videoHosting.demo.notificationModule.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionNotificationService {
    @KafkaListener(topics = "subscriptionnotifications", groupId = "group_id")
    public void consume(String message) {
        // pending  :::::: Process subscription notifications and send JavaMail notification
    }
}
