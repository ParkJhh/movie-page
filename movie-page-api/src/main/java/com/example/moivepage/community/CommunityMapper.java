package com.example.moivepage.community;

import com.example.moivepage.dto.request.RequestCommunity;
import com.example.moivepage.dto.response.ResponseCommunity;
import com.example.moivepage.dto.response.ResponseCommunityList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommunityMapper {
    //게시글 삭제
    void deleteBoard(Long id);
    //게시글 상세 조회
    ResponseCommunity getCommunityDetail(Long id);
    //게시글 목록 조회
    ResponseCommunityList getCommunityList();
    //게시글 등록
    void addBoard(RequestCommunity requestCommunity);
    //게시글 수정
    void updateBoard(RequestCommunity requestCommunity);
}
