package com.example.demo.model;

import com.example.demo.enums.RequestStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FriendRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId ;
    @OneToOne
    @JoinColumn(name = "sender_id")
    private User sender ;
    @OneToOne
    @JoinColumn(name = "receiver_id")
    private User receiver ;
    @Column(name = "status")
    private RequestStatus requestStatus ;

}
