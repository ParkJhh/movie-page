package com.example.moviepage.login;

import com.example.moviepage.dto.Login;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginMapper loginMapper;

    //로그인
    public boolean loginCheck(Login login, HttpServletRequest request){

        Login check = loginMapper.loginCheck(login);
        //없는 경우
        if(check == null){
            return false;
        }

        //아이디 체크후 맞으면 비밀번호 체크
        //비밀번호 체크 성공시 세션 부여 및 리턴 true
        if(check.getLoginId().equals(login.getLoginId())){
            if(check.getPassword().equals(login.getPassword())){
                request.getSession().setAttribute("id", check.getPrimaryId());
                return true;
            }
        }
        //틀릴 경우
        return false;
    }
}
