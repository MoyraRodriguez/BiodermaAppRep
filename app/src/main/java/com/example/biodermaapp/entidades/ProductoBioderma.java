package com.example.biodermaapp.entidades;

import java.util.List;
import java.util.Objects;

public class ProductoBioderma {

    private String id;
    private boolean active;
    private boolean ar;
    private String benefits;
    private  boolean catalog;
    private String description;
    private String extraInformation;
    private List<String> formats;
    private List<ImageLink> imageLinks;
    private List<MediaLink> mediaLinks;
    private List<String> tags;
    private String title;
    private String titleSlug;
    private GamaProducto type;
    private String userAdvice;
    private String userInstructions;

    public ProductoBioderma() {

    }

    public ProductoBioderma(String id, boolean active, boolean ar, String benefits,
                            boolean catalog, String description, String extraInformation,
                            List<String> formats, List<ImageLink> imageLinks, List<MediaLink> mediaLinks,
                            List<String> tags, String title, String titleSlug, GamaProducto type,
                            String userAdvice, String userInstructions) {
        this.id = id;
        this.active = active;
        this.ar = ar;
        this.benefits = benefits;
        this.catalog = catalog;
        this.description = description;
        this.extraInformation = extraInformation;
        this.formats = formats;
        this.imageLinks = imageLinks;
        this.mediaLinks = mediaLinks;
        this.tags = tags;
        this.title = title;
        this.titleSlug = titleSlug;
        this.type = type;
        this.userAdvice = userAdvice;
        this.userInstructions = userInstructions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public boolean isCatalog() {
        return catalog;
    }

    public void setCatalog(boolean catalog) {
        this.catalog = catalog;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(String extraInformation) {
        this.extraInformation = extraInformation;
    }

    public List<String> getFormats() {
        return formats;
    }

    public void setFormats(List<String> formats) {
        this.formats = formats;
    }

    public List<ImageLink> getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(List<ImageLink> imageLinks) {
        this.imageLinks = imageLinks;
    }

    public List<MediaLink> getMediaLinks() {
        return mediaLinks;
    }

    public void setMediaLinks(List<MediaLink> mediaLinks) {
        this.mediaLinks = mediaLinks;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleSlug() {
        return titleSlug;
    }

    public void setTitleSlug(String titleSlug) {
        this.titleSlug = titleSlug;
    }

    public GamaProducto getType() {
        return type;
    }

    public void setType(GamaProducto type) {
        this.type = type;
    }

    public String getUserAdvice() {
        return userAdvice;
    }

    public void setUserAdvice(String userAdvice) {
        this.userAdvice = userAdvice;
    }

    public String getUserInstructions() {
        return userInstructions;
    }

    public void setUserInstructions(String userInstructions) {
        this.userInstructions = userInstructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoBioderma that = (ProductoBioderma) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
