package org.sopt.repository;

import org.sopt.domain.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {

    List<Post> postList = new ArrayList<>();

    public void save(Post post) {
        postList.add(post);
    }

    public List<Post> findAll() {
        return this.postList;


    }

    public Post findOneById(int id) {
        for (Post post : postList) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public boolean deletePostById(int id) {
        for (Post post : postList) {
            if (post.getId() == id) {
                postList.remove(post);
                return true;
            }
        }
        return false;
    }
    public boolean updatePostTitleById(int id, String newTitle) {
        for (Post post : postList) {
            if (post.getId() == id) {
                post.setTitle(newTitle);
                return true;
            }
        }
        return false;
    }

}

