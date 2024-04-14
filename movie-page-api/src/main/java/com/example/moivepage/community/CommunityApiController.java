package com.example.moivepage.community;


import com.example.moivepage.dto.response.ResponseCommunity;
import com.example.moivepage.dto.response.ResponseCommunityList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/community")
public class CommunityApiController {

    @Autowired
    CommunityService communityService;

    @DeleteMapping("/{id}")
    //게시글 삭제
    public void deleteCommunity(){

    }

    @GetMapping("/{id}")
    //게시글 상세 조회
    public ResponseCommunity detailCommunity(){
        return null;
    }

    @GetMapping("/list/{page}")
    //게시글 목록 조회
    public ResponseCommunityList listCommunity(){
        return null;
    }

    @PostMapping("/")
    //게시글 등록
    public void addCommunity(){

    }

    @PutMapping("/{id}")
    //게시글 수정
    public void updateCommunity(){

    }
}
