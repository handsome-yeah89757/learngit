package com.tarena.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tarena.service.UserService;

@Controller
@RequestMapping("user/")
public class UserController {
    @Resource(name="userService")
	private UserService userService;
}
