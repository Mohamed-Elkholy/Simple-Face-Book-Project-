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
    @OneToOne
    @JoinColumn(name = "author_id")
    private User author ;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post ;

    @Override
    public String toString() {
        return "Like{" +
                "likeId=" + likeId +
                ", userId=" + author +
                ", postId=" + post +
                '}';
    }
}
