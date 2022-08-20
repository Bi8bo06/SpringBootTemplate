package com.dsq.blog.controller;

import com.dsq.blog.service.LoginService;
import com.dsq.blog.vo.Result;
import com.dsq.blog.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParam loginParam) {
        //登录 验证用户
        return loginService.login(loginParam);
    }
}