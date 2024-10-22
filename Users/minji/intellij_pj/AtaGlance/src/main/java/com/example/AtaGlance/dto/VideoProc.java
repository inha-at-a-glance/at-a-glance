package com.example.AtaGlance.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VideoProc {
    private Integer videoId;
    private Integer newsId;
    private Integer audioId;
    private String extractFramePath;
    private String objectsPath;

    // Constructors
    public VideoProc() {}

    public VideoProc(Integer videoId, Integer newsId, Integer audioId, String extractFramePath, String objectsPath) {
        this.videoId = videoId;
        this.newsId = newsId;
        this.audioId = audioId;
        this.extractFramePath = extractFramePath;
        this.objectsPath = objectsPath;
    }
}

