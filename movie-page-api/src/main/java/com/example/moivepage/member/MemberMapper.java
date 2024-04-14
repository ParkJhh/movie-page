package com.example.moivepage.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    void deleteMember();

    void addMember();

    void updateMember();
}
