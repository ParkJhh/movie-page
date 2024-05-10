package com.example.moviepage.community;

import com.example.moviepage.dto.request.RequestCommunity;
import com.example.moviepage.dto.response.ResponseCommunity;
import com.example.moviepage.dto.response.ResponseCommunityList;
import com.example.moviepage.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityService {

    private final CommunityMapper communityMapper;

    @Autowired
    public CommunityService(CommunityMapper communityMapper) {
        this.communityMapper = communityMapper;
    }

    @Autowired
    MemberMapper memberMapper;

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
    public ResponseCommunityList getListCommunity(Long page){
        if(page == null){
            page = 0L;
        }
        if(page == 1L){
            page = 0L;
        }
        if(page != null){
            page = page * 10;
        }
        ResponseCommunityList responseCommunityList = new ResponseCommunityList();
        responseCommunityList.setCommunityList(communityMapper.getCommunityList(page));
        return responseCommunityList;
    }

    //게시글 전체 수
    public int getAllCount(){
        return communityMapper.getAllCount();
    }

    //게시글 등록
    public void addCommunity(RequestCommunity requestCommunity, Long sessionId){
        requestCommunity.setUsername(memberMapper.findMemberById(sessionId));
        communityMapper.addBoard(requestCommunity);
    }

    //게시글 수정
    public void updateCommunity(RequestCommunity requestCommunity, Long id){
        requestCommunity.setId(id);
        communityMapper.updateBoard(requestCommunity);
    }
}
