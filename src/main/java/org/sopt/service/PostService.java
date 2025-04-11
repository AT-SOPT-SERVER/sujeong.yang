package org.sopt.service;

import org.sopt.domain.Post;
import org.sopt.repository.PostRepository;

import java.util.List;

public class PostService {

    private PostRepository postRepository = new PostRepository();
    public void createPost(Post post) {
        postRepository.save(post);


    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(int id) {
        return postRepository.findOneById(id);

    }

    public boolean deletePostById(int deleteId) {
        return postRepository.deletePostById(deleteId);
    }

    public boolean updatePostTitle(int id, String newTitle) {
        return postRepository.updatePostTitleById(id, newTitle);
    }

}
