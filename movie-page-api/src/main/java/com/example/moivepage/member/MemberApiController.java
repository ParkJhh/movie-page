package com.example.moivepage.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/member")
public class MemberApiController {

    @Autowired
    MemberService memberService;

    @DeleteMapping("/{id}")
    //회원 삭제
    public void deleteMember(){

    }

    @PostMapping("/")
    //회원 가입
    public void addMember(){

    }

    @PutMapping("/{id}")
    //회원 수정
    public void updateMember(){

    }
}
