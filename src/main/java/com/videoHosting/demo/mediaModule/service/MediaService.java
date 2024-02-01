package com.videoHosting.demo.mediaModule.service;

import com.videoHosting.demo.mediaModule.entity.VideoEntity;
import com.videoHosting.demo.mediaModule.repository.VideoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MediaService {
    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private KafkaTemplate<String, VideoEntity> kafkaTemplate;

    public VideoEntity createMedia(VideoEntity video) {
        VideoEntity savedVideo = videoRepository.save(video);
        kafkaTemplate.send("newvideos", savedVideo);
        return savedVideo;
    }

    public VideoEntity watchVideo(Long id) {
        return videoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Video not found with id: " + id));
    }

}
