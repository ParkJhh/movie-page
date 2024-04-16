package com.example.moivepage.member;

import com.example.moivepage.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    //회원 삭제
    public void deleteMember(Member member){
        memberMapper.deleteMember(member);
    }
    //회원 등록
    public void addMember(Member member){
        memberMapper.addMember(member);
    }
    //회원 수정
    public void updateMember(Member member){
        memberMapper.updateMember(member);
    }
}
