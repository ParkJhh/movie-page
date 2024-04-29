package com.example.moivepage.login;

import com.example.moivepage.dto.Login;
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
        if(check.getLoginid().equals(login.getLoginid())){
            if(check.getPassword().equals(login.getPassword())){
                request.getSession().setAttribute("id", check.getLoginid());
                return true;
            }
        }
        //틀릴 경우
        return false;
    }
}
