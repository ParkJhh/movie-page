package com.example.moivepage.community;

import com.example.moivepage.dto.response.ResponseCommunity;
import com.example.moivepage.dto.response.ResponseCommunityList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityService {

    @Autowired
    CommunityMapper communityMapper;

    //게시글 삭제
    public void deleteCommunity(){
        communityMapper.deleteBoard();
    }

    //게시글 상세 조회
    public ResponseCommunity getCommunityDetail(){
        return communityMapper.getCommunityDetail();
    }

    //게시글 목록 조회
    public ResponseCommunityList getListCommunity(){
        return communityMapper.getCommunityList();
    }

    //게시글 등록
    public void addCommunity(){
        communityMapper.addBoard();
    }

    //게시글 수정
    public void updateCommunity(){
        communityMapper.updateBoard();
    }
}
