package com.example.AtaGlance.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AudioProc {
    private Integer audioId;
    private Integer newsId;
    private String extractTxt;
    private String summaryTxt;
    private String keySentence;
    private String cardTitle;

    // Constructors
    public AudioProc() {}

    public AudioProc(Integer audioId, Integer newsId, String extractTxt, String summaryTxt, String keySentence, String cardTitle) {
        this.audioId = audioId;
        this.newsId = newsId;
        this.extractTxt = extractTxt;
        this.summaryTxt = summaryTxt;
        this.keySentence = keySentence;
        this.cardTitle = cardTitle;
    }

}

