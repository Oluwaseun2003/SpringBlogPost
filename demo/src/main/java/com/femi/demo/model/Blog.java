package com.femi.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String blogTitle;
     private String blogContent;

     private LocalDateTime dateCreated;
     private LocalDateTime dateUpdated;
     public  Blog(String blogTitle, String blogContent, LocalDateTime dateCreated, LocalDateTime dateUpdated){
         this.blogTitle = blogTitle;
         this.blogContent = blogContent;
         this.dateCreated = dateCreated;
         this.dateUpdated = dateUpdated;
     }

     public Blog(){

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
