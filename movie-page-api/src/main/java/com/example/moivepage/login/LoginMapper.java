package com.example.moivepage.login;

import com.example.moivepage.dto.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    //로그인
    Login loginCheck(Login login);
}
