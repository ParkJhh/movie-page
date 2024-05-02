package com.example.moviepage.login;


import com.example.moviepage.dto.Login;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/login")
public class LoginApiController {

    @Autowired
    LoginService loginService;

    @PostMapping("/chk")
    //로그인
    public boolean login(
            @RequestBody
            Login login,
            HttpServletRequest request
    ){
        return loginService.loginCheck(login, request);
    }
}
