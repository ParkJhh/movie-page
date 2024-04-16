package com.example.moivepage.community;


import com.example.moivepage.dto.request.RequestCommunity;
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
    public void deleteCommunity(
            @PathVariable
            Long id
    ){
        communityService.deleteCommunity(id);
    }

    @GetMapping("/{id}")
    //게시글 상세 조회
    public ResponseCommunity detailCommunity(
            @PathVariable
            Long id
    ){
        return communityService.getCommunityDetail(id);
    }

    @GetMapping("/list/{page}")
    //게시글 목록 조회
    public ResponseCommunityList listCommunity(){
        return communityService.getListCommunity();
    }

    @PostMapping("/")
    //게시글 등록
    public void addCommunity(
            @RequestBody
            RequestCommunity requestCommunity
    ){
        communityService.addCommunity(requestCommunity);
    }

    @PutMapping("/{id}")
    //게시글 수정
    public void updateCommunity(
            @RequestBody
            RequestCommunity requestCommunity
    ){
        communityService.updateCommunity(requestCommunity);
    }
}
