package org.sopt.controller;

import org.sopt.domain.Post;
import org.sopt.service.PostService;

import java.util.List;

public class PostController {
    private PostService postService = new PostService();
    private int postId;

    public boolean createPost(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("❌ 제목은 비어 있을 수 없습니다.");
            return false;
        }

        if (title.length() > 30) {
            System.out.println("❌ 제목은 30자 이하여야 합니다.");
            return false;
        }

//        int id = ++postId;
        Post post = new Post(++postId, title);
        postService.createPost(post);
        return true;
    }

    public List<Post> getAllPosts() {
        return postService.getAllPosts();


    }

    public Post getPostById(int id) {
        return postService.getPostById(id);

    }

    public boolean deletePostById(int deleteId) {
        return postService.deletePostById(deleteId);
    }


//    public List<Post> searchPostsByKeyword(String keyword) {
//
//    }

    public boolean updatePostTitle(int id, String newTitle) {
        return postService.updatePostTitle(id, newTitle);
    }

}
