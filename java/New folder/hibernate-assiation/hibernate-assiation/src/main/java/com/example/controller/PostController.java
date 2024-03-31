package com.example.controller;

import com.example.entity.Post;
import com.example.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/addPost")
    public ResponseEntity<String> addPost(@RequestBody Post post){
        postService.addPost(post);
        return new ResponseEntity<>("Post created Successfully", HttpStatus.CREATED);
    }
}
