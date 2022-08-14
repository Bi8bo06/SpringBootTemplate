package com.dsq.blog.service;

import com.dsq.blog.dao.pojo.SysUser;

public interface SysUserService {
    SysUser findUserById(Long id);
}
