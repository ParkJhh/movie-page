package com.example.moviepage.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResponseCommunity {
    int id;
    String title;
    String note;
    String username;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    int viewCount;
}
