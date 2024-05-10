package com.example.moviepage.login;

import com.example.moviepage.dto.Login;
import com.example.moviepage.dto.request.RequestNewPassword;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    //로그인
    Login loginCheck(Login login);
    //중복 아이디 확인
    String idCheck(String loginId);
    //비밀번호 변경
    void updatePassword(RequestNewPassword requestNewPassword);
}
