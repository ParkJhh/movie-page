package com.example.moivepage.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginMapper loginMapper;

    //로그인
    public boolean loginCheck(){
        return loginMapper.loginCheck();
    }
}
