package com.example.moviepage.member;

import com.example.moviepage.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/api/member")
public class MemberApiController {

    @Autowired
    MemberService memberService;

    @DeleteMapping("/{id}")
    //회원 삭제
    public void deleteMember(
            @RequestBody
            Member member
    ){
        memberService.deleteMember(member);
    }

    @PostMapping("/")
    //회원 가입
    public void addMember(
            @RequestBody
            Member member
    ){
        memberService.addMember(member);
    }

    @PutMapping("/{id}")
    //회원 수정
    public void updateMember(
            @RequestBody
            Member member
    ){
        memberService.updateMember(member);
    }
}
