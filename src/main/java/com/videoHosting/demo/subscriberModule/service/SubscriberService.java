package com.videoHosting.demo.subscriberModule.service;

import com.videoHosting.demo.subscriberModule.Entity.SubscriberEntity;
import com.videoHosting.demo.subscriberModule.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {
    @Autowired
    private SubscriberRepository subscriberRepository;

    public SubscriberEntity registerSubscriber(SubscriberEntity subscriber) {
        return subscriberRepository.save(subscriber);
    }

    public void subscribeToChannel(Long channelId, SubscriberEntity subscriber) {
        // Add subscription logic
    }

    // Additional methods for handling subscriptions, finding subscribers, etc.
}
