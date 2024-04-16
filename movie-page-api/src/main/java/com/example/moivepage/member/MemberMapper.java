package com.example.moivepage.member;

import com.example.moivepage.dto.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    //회원 삭제
    void deleteMember(Member member);
    //회원 등록
    void addMember(Member member);
    //회원 수정
    void updateMember(Member member);
}
