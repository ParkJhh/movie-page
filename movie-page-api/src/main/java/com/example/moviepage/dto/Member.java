package com.example.moviepage.dto;

import lombok.Data;

@Data
public class Member {
    String loginId;
    String password;
    String name;
    String email;
    String phone;
    String address_no;
    String address1;
    String address2;
    String birthday;
    int gender;
}
