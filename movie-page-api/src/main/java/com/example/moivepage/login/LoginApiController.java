package com.example.moivepage.login;


import com.example.moivepage.dto.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/login")
public class LoginApiController {

    @Autowired
    LoginService loginService;

    @PostMapping("/")
    //로그인
    public boolean login(
            @RequestBody
            Login login
    ){
        return loginService.loginCheck(login);
    }
}
