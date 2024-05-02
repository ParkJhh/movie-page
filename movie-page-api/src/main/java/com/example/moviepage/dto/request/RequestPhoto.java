package com.example.moviepage.dto.request;

import lombok.Data;

@Data
public class RequestPhoto {
    String loginId;
    byte[] photo;
    String img;
}
