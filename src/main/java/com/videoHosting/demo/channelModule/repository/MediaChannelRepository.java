package com.videoHosting.demo.channelModule.repository;

import com.videoHosting.demo.channelModule.entity.MediaChannelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaChannelRepository extends JpaRepository<MediaChannelEntity, Long> {
}
