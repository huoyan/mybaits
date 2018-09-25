package com.zxp.mybaits;

import com.zxp.mybaits.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserDao  userDao;

    @Transactional
    @GetMapping("user")
    public ResultEntity hello(){

        User user = new User();
        user.setUsername("nanasd");
        user.setPassword("123456");
        userDao.add(user);
        return new ResultEntity().setData(user);
    }
}
