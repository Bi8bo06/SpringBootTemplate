package com.dsq.blog.controller;

import com.dsq.blog.service.SysUserService;
import com.dsq.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("currentUser")
    public Result currenUser(@RequestHeader("Authorization") String token) {
        return sysUserService.findUserByToken(token);
    }
}
