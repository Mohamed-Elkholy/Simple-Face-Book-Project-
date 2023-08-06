package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeId ;
    @Id
    @Column(name = "user_id")
    private Long userId ;
    @Id
    @Column(name = "post_id")
    private Long postId ;

    @Override
    public String toString() {
        return "Like{" +
                "likeId=" + likeId +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
