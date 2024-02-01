package com.videoHosting.demo.mediaModule.controller;

import com.videoHosting.demo.mediaModule.entity.VideoEntity;
import com.videoHosting.demo.mediaModule.repository.VideoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/media")
public class MediaController {
    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private KafkaTemplate<String, VideoEntity> kafkaTemplate;

    @PostMapping
    public VideoEntity createMedia(@RequestBody VideoEntity video) {
        VideoEntity savedVideo = videoRepository.save(video);

        // Send video info to Kafka topic
        kafkaTemplate.send("newvideos", savedVideo);

        return savedVideo;
    }

    @GetMapping("/watch/{id}")
    public VideoEntity watchVideo(@PathVariable Long id) {
        // Retrieve video from database
        return videoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Video not found with id: " + id));
    }

}
