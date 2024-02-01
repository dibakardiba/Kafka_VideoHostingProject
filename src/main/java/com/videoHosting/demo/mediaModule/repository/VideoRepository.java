package com.videoHosting.demo.mediaModule.repository;

import com.videoHosting.demo.mediaModule.entity.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, Long> {
}
