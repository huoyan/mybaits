package com.zxp.mybaits.dao;

import com.zxp.mybaits.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public int add(User user);
}
