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
    @Column(name = "post_id")
    private Long postId ;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author ;
    @Column(name = "content")
    private String content ;
    @Column(name = "post_time")
    private LocalDateTime time ;

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", authorId=" + author +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
