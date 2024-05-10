package com.example.moviepage.community;


import com.example.moviepage.dto.request.RequestCommunity;
import com.example.moviepage.dto.response.ResponseCommunity;
import com.example.moviepage.dto.response.ResponseCommunityList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/community")
public class CommunityApiController {

    private final CommunityService communityService;

    @Autowired
    public CommunityApiController(CommunityService communityService) {
        this.communityService = communityService;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "커뮤니티 게시물 삭제")
    public void deleteCommunity(
            @PathVariable
            @Parameter(description = "삭제할 커뮤니티 게시물 번호")
            Long id
    ){
        communityService.deleteCommunity(id);
    }

    @GetMapping("/{id}")
    @Operation(summary = "커뮤니티 게시물 상세 조회")
    public ResponseCommunity detailCommunity(
            @PathVariable
            @Parameter(description = "조회할 커뮤니티 게시물 번호")
            Long id
    ){
        return communityService.getCommunityDetail(id);
    }

    @GetMapping("/list/{page}")
    @Operation(summary = "커뮤니티 게시물 목록 조회")
    //게시글 목록 조회
    public ResponseCommunityList listCommunity(
            @PathVariable
            @Parameter(description = "페이지 번호")
            Long page
    ){
        return communityService.getListCommunity(page);
    }

    @GetMapping("/countAll")
    @Operation(summary = "커뮤니티 게시물 전체 개수")
    public int allCount(){
        return communityService.getAllCount();
    }

    @PostMapping("/")
    @Operation(summary = "커뮤니티 게시물 등록")
    public void addCommunity(
            @RequestBody
            @Parameter(description = "등록할 커뮤니티 게시물")
            RequestCommunity requestCommunity,

//            @SessionAttribute(name = "id")
            @Parameter(description = "세션 아이디")
            Long sessionId
    ){
        communityService.addCommunity(requestCommunity, sessionId);
    }

    @PutMapping("/{id}")
    @Operation(summary = "커뮤니티 게시물 수정")
    public void updateCommunity(
            @RequestBody
            @Parameter(description = "수정할 커뮤니티 게시물")
            RequestCommunity requestCommunity,

            @PathVariable
            @Parameter(description = "수정 커뮤니티 게시물 번호")
            Long id
    ){
        communityService.updateCommunity(requestCommunity, id);
    }
}
