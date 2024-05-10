package com.example.moviepage.login;


import com.example.moviepage.dto.Login;
import com.example.moviepage.dto.request.RequestNewPassword;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/api/login")
public class LoginApiController {
    private final LoginService loginService;

    @Autowired
    public LoginApiController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/chk")
    @Operation(summary = "로그인")
    public boolean login(
            @RequestBody
            Login login,
            HttpServletRequest request
    ){
        return loginService.loginCheck(login, request);
    }

    @PostMapping("/idChk")
    @Operation(summary = "중복 아이디 확인")
    public boolean idChk(
            @RequestBody
            String loginId
    ){
        return loginService.idCheck(loginId);
    }

    @PutMapping("/pwChange")
    @Operation(summary = "비밀번호 변경")
    public boolean changePassword(
            //            @SessionAttribute(name="id")
            @Parameter(description = "세션 아이디")
            Long sessionId,

            @RequestBody
            @Parameter(description = "변경할 비밀번호")
            RequestNewPassword requestNewPassword
    ){
        return loginService.changePw(sessionId,requestNewPassword);
    }
}
