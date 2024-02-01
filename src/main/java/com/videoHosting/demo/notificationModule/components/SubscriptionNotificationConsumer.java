package com.videoHosting.demo.notificationModule.components;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

// SubscriptionNotificationConsumer.java
@Component
public class SubscriptionNotificationConsumer {
    @KafkaListener(topics = "subscriptionnotifications", groupId = "group_id")
    public void consume(String message)
    {
        /* pending  :::: This Process is  subscription notifications
        and send JavaMail notification
         */
    }
}
