package com.femi.demo.dto;

import java.time.LocalDateTime;

public class BlogDto {
    private long id;
    private String blogTitle;
    private String blogContent;

    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    public  BlogDto(String blogTitle, String blogContent, LocalDateTime dateCreated, LocalDateTime dateUpdated){
        this.blogTitle = blogTitle;
        this.blogContent = blogContent;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public BlogDto(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogName) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogType) {
        this.blogContent = blogContent;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
