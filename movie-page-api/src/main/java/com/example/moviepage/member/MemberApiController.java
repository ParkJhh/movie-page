package com.example.moviepage.member;

import com.example.moviepage.dto.Member;
import com.example.moviepage.dto.request.RequestPhoto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/api/member")
public class MemberApiController {

    private final MemberService memberService;

    public MemberApiController(MemberService memberService) {
        this.memberService = memberService;
    }

    @DeleteMapping("/")
    //회원 삭제
    public boolean deleteMember(
//            @SessionAttribute(name="id")
            @Parameter(description = "세션 아이디")
            Long sessionId,

            @RequestParam
            @Parameter(description = "비밀번호")
            String password,

            @RequestParam
            @Parameter(description = "비밀번호확인")
            String passwordCheck
    ){
        return memberService.deleteMember(sessionId, password, passwordCheck);
    }

    @PostMapping("/")
    //회원 가입
    public void addMember(
            @RequestBody
            Member member
    ){
        memberService.addMember(member);
    }

    @PutMapping("/")
    //회원 수정
    public void updateMember(
            @RequestBody
            Member member
    ){
        memberService.updateMember(member);
    }

    @PutMapping("/profile")
    //회원 사진 변경
    public void PutProfile(
//            @SessionAttribute(name="id")
            @Parameter(description = "로그인 회원 번호")
            Long sessionId,

            @RequestBody
            @Parameter(description = "프로필 사진")
            RequestPhoto profile
    ){
        memberService.updateProfile(profile, sessionId);
    }
}
