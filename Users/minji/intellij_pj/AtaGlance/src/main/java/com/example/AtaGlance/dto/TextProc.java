package com.example.AtaGlance.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
public class TextProc {
    private Integer textId;

    @NotNull
    private Integer newsId;

    private List<String> extractTxt;

    private String summaryTxt;

    private String keySentence;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // Constructor
    public TextProc(Integer textId, Integer newsId, List<String> extractTxt, String summaryTxt,
                    String keySentence, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.textId = textId;
        this.newsId = newsId;
        this.extractTxt = extractTxt;
        this.summaryTxt = summaryTxt;
        this.keySentence = keySentence;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
}
