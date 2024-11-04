package com.example.AtaGlance.dto;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter

public class News {
    private Integer newsId;
    @NotNull
    private Integer sourceBc;
    @NotNull
    private String sourceUrl;
    private String videoFilePath;
    private String title;
    private Integer category;
    private List<String> cardsPath;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructor
    public News(Integer newsId, Integer sourceBc, String sourceUrl, String videoFilePath, String title,
                Integer category, List<String> cardsPath, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.newsId = newsId;
        this.sourceBc = sourceBc;
        this.sourceUrl = sourceUrl;
        this.videoFilePath = videoFilePath;
        this.title = title;
        this.category = category;
        this.cardsPath = cardsPath;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
