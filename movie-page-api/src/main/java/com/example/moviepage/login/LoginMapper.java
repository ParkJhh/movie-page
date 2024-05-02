package com.example.moviepage.login;

import com.example.moviepage.dto.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    //로그인
    Login loginCheck(Login login);
}
