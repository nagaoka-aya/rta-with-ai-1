package com.example.myapp.entity;

public class User {
    private Long userId;
    private String kanjiName;
    private String kanaName;
    private Boolean pmFlag;

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getKanjiName() {
        return kanjiName;
    }

    public void setKanjiName(String kanjiName) {
        this.kanjiName = kanjiName;
    }

    public String getKanaName() {
        return kanaName;
    }

    public void setKanaName(String kanaName) {
        this.kanaName = kanaName;
    }

    public Boolean getPmFlag() {
        return pmFlag;
    }

    public void setPmFlag(Boolean pmFlag) {
        this.pmFlag = pmFlag;
    }
}
