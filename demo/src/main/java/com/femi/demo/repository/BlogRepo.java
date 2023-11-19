package com.femi.demo.repository;

import com.femi.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog, Long> {

}
