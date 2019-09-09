package com.example.biodermaapp.entidades;

public class ImageLink {

    private String key;
    private int storagepath;
    private String uri;

    public ImageLink(String key, int storagepath, String uri) {
        this.key = key;
        this.storagepath = storagepath;
        this.uri = uri;
    }

    public ImageLink() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getStoragepath() {
        return storagepath;
    }

    public void setStoragepath(int storagepath) {
        this.storagepath = storagepath;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
