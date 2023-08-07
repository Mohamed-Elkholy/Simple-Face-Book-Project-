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
    @Column(name = "comment_id")
    private Long commentId ;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post ;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author ;
    @Column(name = "content")
    private String content ;
    @Column(name = "comment_time")
    private LocalDateTime time ;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", postId=" + post +
                ", authorId=" + author +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
