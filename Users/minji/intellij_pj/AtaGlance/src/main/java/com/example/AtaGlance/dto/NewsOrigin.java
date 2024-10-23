package com.example.AtaGlance.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsOrigin {
    private Integer newsId;
    private String sourceBc;
    private String sourceURL;
    private Integer category;
    private String videoFilePath;

    // Constructors
    public NewsOrigin() {}

    public NewsOrigin(Integer newsId, String sourceBc, String sourceURL, Integer category, String videoFilePath) {
        this.newsId = newsId;
        this.sourceBc = sourceBc;
        this.sourceURL = sourceURL;
        this.category = category;
        this.videoFilePath = videoFilePath;
    }

}

