package com.example.AtaGlance.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class CardNews {
    private Integer cardId;
    private Integer newsId;
    private Integer audioId;
    private Integer category;
    private String cardsPath;
    private Timestamp createdAt;

    // Constructors
    public CardNews() {}

    public CardNews(Integer cardId, Integer newsId, Integer audioId, Integer category, String cardsPath, Timestamp createdAt) {
        this.cardId = cardId;
        this.newsId = newsId;
        this.audioId = audioId;
        this.category = category;
        this.cardsPath = cardsPath;
        this.createdAt = createdAt;
    }
}

