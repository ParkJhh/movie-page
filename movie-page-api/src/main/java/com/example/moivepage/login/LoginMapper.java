package com.example.moivepage.login;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    boolean loginCheck();
}
