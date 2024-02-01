package com.videoHosting.demo.subscriberModule.controller;

import com.videoHosting.demo.subscriberModule.Entity.SubscriberEntity;
import com.videoHosting.demo.subscriberModule.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscribers")
public class SubscriberController {
    @Autowired
    private SubscriberRepository subscriberRepository;

    @PostMapping
    public SubscriberEntity registerSubscriber(@RequestBody SubscriberEntity subscriber) {
        // Save subscriber to database
        return subscriberRepository.save(subscriber);
    }

    @PostMapping("/subscribe/{channelId}")
    public void subscribeToChannel(@PathVariable Long channelId, @RequestBody SubscriberEntity subscriber) {
        // Add subscription logic
    }

    // Other methods for handling subscriptions, finding subscribers, etc.
}
