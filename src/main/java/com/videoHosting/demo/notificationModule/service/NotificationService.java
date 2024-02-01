package com.videoHosting.demo.notificationModule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

// NotificationService.java

@Service
public class NotificationService
{
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendSubscriptionNotification(String notification) {
        kafkaTemplate.send("subscriptionnotifications", notification);
    }

    // pending ::: Other methods for sending notifications
}
