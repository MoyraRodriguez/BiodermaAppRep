package com.example.biodermaapp.entidades;

public class MediaLink {

    private String key;
    private String title;
    private String uri;

    public MediaLink() {
    }

    public MediaLink(String key, String title, String uri) {
        this.key = key;
        this.title = title;
        this.uri = uri;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
