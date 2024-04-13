package com.example.moivepage.dto;

import lombok.Data;

@Data
public class Member {
    String loginid;
    String password;
    String name;
    String address;
    String email;
    String gender;
    byte[] photo;
}
