package com.example.moviepage.login;

import com.example.moviepage.dto.Login;
import com.example.moviepage.dto.request.RequestNewPassword;
import com.example.moviepage.member.MemberMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginMapper loginMapper;
    @Autowired
    MemberMapper memberMapper;

    //로그인
    public boolean loginCheck(Login login, HttpServletRequest request){
        Login check = loginMapper.loginCheck(login);
        //회원 정보 없는 경우
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

    //비밀번호 변경
    public boolean changePw(Long sessionId, RequestNewPassword requestNewPassword){
        //입력받은 비밀번호 체크
        if(requestNewPassword.getChangePassword().equals(requestNewPassword.getChangePasswordCheck())){
            //실제 DB비밀번호와 입력받은 현재 비밀번호 확인
            String dbPassword = memberMapper.findPasswordById(sessionId);
            if(dbPassword.equals(requestNewPassword.getNowPassword())){
                requestNewPassword.setLoginId(memberMapper.findMemberById(sessionId));
                loginMapper.updatePassword(requestNewPassword);
                return true;
            }
        }
        return false;
    }

}
