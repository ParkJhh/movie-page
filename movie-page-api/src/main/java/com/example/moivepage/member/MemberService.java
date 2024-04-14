package com.example.moivepage.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    //회원 삭제
    public void deleteMember(){
        memberMapper.deleteMember();
    }

    //회원 등록
    public void addMember(){
        memberMapper.addMember();
    }
    //회원 수정
    public void updateMember(){
        memberMapper.updateMember();
    }
}
