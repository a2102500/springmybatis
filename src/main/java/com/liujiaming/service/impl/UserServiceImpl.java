package com.liujiaming.service.impl;

import com.liujiaming.dao.UserDao;
import com.liujiaming.model.user_t;
import com.liujiaming.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liujm on 2017/12/12.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
   @Resource
   private UserDao userdao;
    @Override
    public user_t getUserById(int id) {
        return userdao.selectByPrimaryKey(id);
    }
}
