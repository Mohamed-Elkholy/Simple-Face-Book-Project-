package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId ;
    @Id
    @Column(name = "post_id")
    private Long postId ;
    @Id
    @Column(name = "author_id")
    private Long authorId ;
    @Column(name = "content")
    private String content ;
    @Column(name = "comment_time")
    private LocalDateTime time ;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", postId=" + postId +
                ", authorId=" + authorId +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
