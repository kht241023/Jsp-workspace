package kh.edu.jspexam.service;

import kh.edu.jspexam.model.dto.PostDTO;

import java.util.List;

public interface PostService {
    // 게시물 모두 조회
    List<PostDTO> getAllPosts();
    // 아이디에 해당하는 특정 게시물만 상세 조회
    PostDTO getPostById(int postId);
    // 게시물 저장하기
    void createPost(PostDTO post);
}
