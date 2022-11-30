package com.dsq.blog.controller;

import com.dsq.blog.service.LoginService;
import com.dsq.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("logout")
public class LogoutController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result logout(@RequestHeader("Authorization") String token) {
        //登录 验证用户
        return loginService.logout(token);
    }
}
