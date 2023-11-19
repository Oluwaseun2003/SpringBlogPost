package com.femi.demo.controller;


import com.femi.demo.dto.BlogDto;
import com.femi.demo.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class BlogController {
    private  final BlogService blogService;

    public BlogController(BlogService blogService1){
        this.blogService = blogService1;
    }


    @PostMapping(value = "/blog/creat")
    public Object createBlog(@RequestBody BlogDto blogDto){
        return  blogService.createBlog(blogDto);
    }



}
