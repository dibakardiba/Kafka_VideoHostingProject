package com.videoHosting.demo.subscriberModule.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChannelInfo {
    @Id
    private Long channelId;

    private String channelName;

    // Constructors, getters, and setters

    // Getters and setters for channelId and channelName
    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
