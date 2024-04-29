package com.example.moivepage.community;

import com.example.moivepage.dto.request.RequestCommunity;
import com.example.moivepage.dto.response.ResponseCommunity;
import com.example.moivepage.dto.response.ResponseCommunityList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityService {

    @Autowired
    CommunityMapper communityMapper;

    //게시글 삭제
    public void deleteCommunity(Long id){
        communityMapper.deleteBoard(id);
    }

    //게시글 상세 조회
    public ResponseCommunity getCommunityDetail(Long id){
        //조회수 업
        communityMapper.upCount(id);
        return communityMapper.getCommunityDetail(id);
    }

    //게시글 목록 조회
    public ResponseCommunityList getListCommunity(){
        return communityMapper.getCommunityList();
    }

    //게시글 등록
    public void addCommunity(RequestCommunity requestCommunity){
        communityMapper.addBoard(requestCommunity);
    }

    //게시글 수정
    public void updateCommunity(RequestCommunity requestCommunity){
        communityMapper.updateBoard(requestCommunity);
    }
}
