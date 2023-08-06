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
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId ;
    @Id
    @Column(name = "author_id")
    private Long authorId ;
    @Column(name = "content")
    private String content ;
    @Column(name = "post_time")
    private LocalDateTime time ;

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", authorId=" + authorId +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
