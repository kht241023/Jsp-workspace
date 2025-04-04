package kh.edu.jspexam.mapper;

import kh.edu.jspexam.model.dto.PostDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostMapper {

    // 모든 게시물 조회
    @Select("SELECT " +
            "post_id AS postId, " +
            "post_title AS postTitle, " +
            "post_content AS postContent, " +
            "post_writer AS postwriter," +
            "created_at AS createAt" +
            " FROM post")
    List<PostDTO> selectAllPosts();

    // 특정 게시물 조회
    @Select("SELECT " +
            "post_id AS postId, " +
            "post_title AS postTitle, " +
            "post_content AS postContent, " +
            "post_writer AS postwriter" +
            "created_at AS createAt" +
            " FROM post WHERE post_id = ${postId}")
    PostDTO selectPostById(@Param("postId") int postId);

    // 게시물 저장하기
    @Insert("INSERT INTO  post (post_title, post_content, post_writer) " +
            "VALUES (#{postTitle}, #{postContent}, #{postWriter}")
    void insertPost(PostDTO post);
}
