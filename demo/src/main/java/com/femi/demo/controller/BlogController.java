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

    public BlogController(BlogService blogService){
        this.blogService = blogService;
    }

    @PostMapping(value = "/blog/create")
    public Object createBlog(@RequestBody BlogDto blogDto){
        System.out.println(blogDto);
        return  blogService.createBlog(blogDto);
    }

@GetMapping("/blog")
public Object fetchAllBlog(){
        return blogService.fetchAllBlog();
}

@PutMapping("/blog/{id}")
    public Object updateBlog(@RequestBody BlogDto blogDto, @PathVariable Long id){
        return blogService.updateBlog(blogDto, id);
}

@DeleteMapping("/blog/{id}")
public Object deleteBlog(@PathVariable long id){
        return  blogService.deleteBlog(id);
}

}

