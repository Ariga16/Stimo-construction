package com.dacasa.stimocompanylimited;

public class CvItem {

    private String title;
    private String description;

    public CvItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public CvItem() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
