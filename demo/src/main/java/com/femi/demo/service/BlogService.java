package com.femi.demo.service;


import com.femi.demo.dto.BlogDto;
import com.femi.demo.model.Blog;
import com.femi.demo.repository.BlogRepo;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private final BlogRepo blogRepo;

    public BlogService(BlogRepo blogRepo){
        this.blogRepo = blogRepo;
    }

    //CREATE BLOG

    public Object createBlog(BlogDto blogDto){
        Blog blog = new Blog();

        //MAPPING NECESSARY FIELDS
        blog.setBlogTitle(blogDto.getBlogTitle());
        blog.setBlogContent(blogDto.getBlogContent());
        blog.setDateCreated(blogDto.getDateCreated());
        blog.setDateUpdated(blogDto.getDateUpdated());

        //SAVE INTO OUR REPO
        return blogRepo.save(blog);
    }

    public Object fetchAllBlog(){
        return blogRepo.findAll();
    }


    public Object fetchABlog(BlogRepo blogRepo, Long id){
        return blogRepo.findById(id);
    }


    public Object updateBlog(BlogDto blogDto, Long id){
        Blog blog = blogRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog post not found"));

        blog.setBlogTitle(blogDto.getBlogTitle());
        blog.setBlogContent(blogDto.getBlogContent());
        blog.setDateCreated(blogDto.getDateCreated());
        blog.setDateUpdated(blogDto.getDateUpdated());

        return blogRepo.save(blog);


    }


    public Object deleteBlog(Long id){
        Blog blog = blogRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog post can be found"));
        blogRepo.delete(blog);
        return ("Blog post has been updated successfully");
    }






}
