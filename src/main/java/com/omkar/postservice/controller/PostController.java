package com.omkar.postservice.controller;

import com.omkar.postservice.entity.Post;
import com.omkar.postservice.entity.Response;
import com.omkar.postservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private PostService postService;
    @PostMapping(path = "/posts")
    public Response createPost(@Validated @RequestBody Post post){
        return postService.createPost(post);
    }
    @GetMapping(path = "/posts")
    public Response getPosts(){
        return postService.getPosts();
    }
    @GetMapping(path = "/posts/{id}")
    public Response getPostById(@PathVariable Long id){
        return postService.getPostById(id);
    }
    @PutMapping(path = "/posts/{id}")
    public Response updatePost(@RequestBody Post post, @PathVariable Long id){
        return postService.updatePost(post, id);
    }
    @DeleteMapping(path = "/posts/{id}")
    public Response deletePost(@PathVariable Long id){
        return postService.deletePost(id);
    }
}
