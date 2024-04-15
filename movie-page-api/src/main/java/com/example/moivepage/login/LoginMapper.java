package com.example.moivepage.login;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    //로그인
    boolean loginCheck();
}
