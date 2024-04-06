package com.omkar.postservice.service;

import com.omkar.postservice.entity.Post;
import com.omkar.postservice.entity.Response;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    Response createPost(Post post);
    Response getPosts();
    Response getPostById(Long id);
    Response updatePost(Post post, Long id);
    Response deletePost(Long id);

}
