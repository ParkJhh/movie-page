package com.example.moviepage.community;

import com.example.moviepage.dto.request.RequestCommunity;
import com.example.moviepage.dto.response.ResponseCommunity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityMapper {
    //게시글 삭제
    void deleteBoard(Long id);
    //게시글 상세 조회
    ResponseCommunity getCommunityDetail(Long id);
    //게시글 목록 조회
    List<ResponseCommunity> getCommunityList(Long page);
    //게시글 전체 조회
    int getAllCount();
    //게시글 등록
    void addBoard(RequestCommunity requestCommunity);
    //게시글 수정
    void updateBoard(RequestCommunity requestCommunity);
    //게시글 조회수 증가
    void upCount(Long id);
}
