package com.sbr.chap5.mybatis.dao;

import com.sbr.chap5.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
     List<User> selectUser();
}
