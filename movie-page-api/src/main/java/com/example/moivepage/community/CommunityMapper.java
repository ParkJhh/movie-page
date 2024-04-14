package com.example.moivepage.community;

import com.example.moivepage.dto.response.ResponseCommunity;
import com.example.moivepage.dto.response.ResponseCommunityList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommunityMapper {

    void deleteBoard();

    ResponseCommunity getCommunityDetail();

    ResponseCommunityList getCommunityList();

    void addBoard();

    void updateBoard();
}
