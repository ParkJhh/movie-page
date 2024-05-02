package com.example.moviepage.member;

import com.example.moviepage.dto.Member;
import com.example.moviepage.dto.request.RequestPhoto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    //회원 삭제
    void deleteMember(Long sessionId);
    //회원 등록
    void addMember(Member member);
    //회원 수정
    void updateMember(Member member);
    //세션ID로 회원아이디 찾기
    String findMemberById(Long sessionId);
    //세션ID로 비밀번호 찾기
    String findPasswordById(Long sessionId);
    //회원 사진 변경
    void updateProfile(RequestPhoto profile);
}
