package com.example.news_app;

public class ModelClass {


    private String author,tittle,description,url,urlToImage,publishesAt;

    public ModelClass(String author, String tittle, String description, String url, String urlToImage, String publishesAt) {
        this.author = author;
        this.tittle = tittle;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishesAt = publishesAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishesAt() {
        return publishesAt;
    }

    public void setPublishesAt(String publishesAt) {
        this.publishesAt = publishesAt;
    }
}
