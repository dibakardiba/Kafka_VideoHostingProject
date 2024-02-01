package com.videoHosting.demo.channelModule.service;

import com.videoHosting.demo.channelModule.repository.MediaChannelRepository;
import com.videoHosting.demo.channelModule.entity.MediaChannelEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChannelService {
    @Autowired
    private MediaChannelRepository mediaChannelRepository;

    public MediaChannelEntity createChannel(MediaChannelEntity channel) {
        return mediaChannelRepository.save(channel);
    }

    public MediaChannelEntity findChannelById(Long id) {
        return mediaChannelRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Channel not found with id: " + id));
    }
}
