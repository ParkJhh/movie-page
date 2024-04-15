package com.example.moivepage.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    //회원 삭제
    void deleteMember();

    //회원 등록
    void addMember();

    //회원 수정
    void updateMember();
}
