package com.example.demo.repository;

import com.example.demo.controller.FriendRequestController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FriendRequestRepository extends JpaRepository<FriendRequestController , Long> {
}
