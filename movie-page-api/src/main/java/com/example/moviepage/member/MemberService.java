package com.example.moviepage.member;

import com.example.moviepage.dto.Login;
import com.example.moviepage.dto.Member;
import com.example.moviepage.dto.request.RequestPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    //회원 삭제
    public boolean deleteMember(Long sessionId, String password, String passwordCheck){
        //입력값 확인
        if(password.equals(passwordCheck)){
            //실제 DB와의 확인
            String dbPassword = memberMapper.findPasswordById(sessionId);
            if(dbPassword.equals(password)){
                memberMapper.deleteMember(sessionId);
                return true;
            }
        }
        return false;
    }
    //회원 등록
    public void addMember(Member member){
        memberMapper.addMember(member);
    }
    //회원 수정
    public void updateMember(Member member){
        memberMapper.updateMember(member);
    }

    //회원 프로필 사진 변경
    public void updateProfile(RequestPhoto profile, Long sessionId){
        //가져온 사진을 byte[]로 변환
        profile.setPhoto(Base64.getDecoder().decode(profile.getImg()));
        profile.setLoginId(memberMapper.findMemberById(sessionId));
        memberMapper.updateProfile(profile);
    }
}
