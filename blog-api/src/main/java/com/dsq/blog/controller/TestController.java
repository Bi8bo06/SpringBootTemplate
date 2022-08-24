package com.dsq.blog.controller;

import com.dsq.blog.dao.pojo.SysUser;
import com.dsq.blog.utils.UserThreadLocal;
import com.dsq.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping
    public Result test() {
        SysUser sysUser = UserThreadLocal.get();
        return Result.success(sysUser);
    }
}
