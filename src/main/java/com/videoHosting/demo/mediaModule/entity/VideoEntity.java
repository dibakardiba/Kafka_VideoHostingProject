package com.videoHosting.demo.mediaModule.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class VideoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer widthResolution;

    private Integer heightResolution;

    private Long uploadedTo; // MediaChannel id

    private String name;

    private String title;

    private LocalDateTime uploadDateTime;

    private long viewsCount;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWidthResolution() {
        return widthResolution;
    }

    public void setWidthResolution(Integer widthResolution) {
        this.widthResolution = widthResolution;
    }

    public Integer getHeightResolution() {
        return heightResolution;
    }

    public void setHeightResolution(Integer heightResolution) {
        this.heightResolution = heightResolution;
    }

    public Long getUploadedTo() {
        return uploadedTo;
    }

    public void setUploadedTo(Long uploadedTo) {
        this.uploadedTo = uploadedTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getUploadDateTime() {
        return uploadDateTime;
    }

    public void setUploadDateTime(LocalDateTime uploadDateTime) {
        this.uploadDateTime = uploadDateTime;
    }

    public long getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(long viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
