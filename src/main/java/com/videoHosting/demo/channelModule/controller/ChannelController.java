package com.videoHosting.demo.channelModule.controller;

import com.videoHosting.demo.channelModule.repository.MediaChannelRepository;
import com.videoHosting.demo.channelModule.entity.MediaChannelEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/channels")
public class ChannelController {
   @Autowired
   MediaChannelRepository mediaChannelRepository;

    @PostMapping
    public MediaChannelEntity createChannel(@RequestBody MediaChannelEntity channel) {
        return mediaChannelRepository.save(channel);
    }

    @GetMapping("/{id}")
    public MediaChannelEntity findChannelById(@PathVariable Long id) {
        return mediaChannelRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Channel not found with id: " + id));
    }
}
