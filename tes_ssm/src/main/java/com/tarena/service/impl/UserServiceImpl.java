package com.tarena.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tarena.dao.UserMapper;
import com.tarena.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
     @Resource(name="userMapper")
	private UserMapper userMapper;
}
