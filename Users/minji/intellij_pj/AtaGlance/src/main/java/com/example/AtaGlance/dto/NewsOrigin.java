package com.example.AtaGlance.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsOrigin {
    private Integer newsId;
    private String sourceBc;
    private String sourceUrl;
    private String videoFilePath;

    // Constructors
    public NewsOrigin() {}

    public NewsOrigin(Integer newsId, String sourceBc, String sourceUrl, String videoFilePath) {
        this.newsId = newsId;
        this.sourceBc = sourceBc;
        this.sourceUrl = sourceUrl;
        this.videoFilePath = videoFilePath;
    }

}

