package com.fourirsw.springboot.dto;

import com.fourirsw.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

//게시판 목록보기를 위한 ListResponseDto
@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
