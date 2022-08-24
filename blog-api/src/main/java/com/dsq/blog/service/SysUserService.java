package com.dsq.blog.service;

import com.dsq.blog.dao.pojo.SysUser;
import com.dsq.blog.vo.Result;


public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    /**
     * 根据token查询用户信息
     *
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    /**
     * 根据账号查找用户
     *
     * @param account
     * @return
     */
    SysUser findUserByAccount(String account);

    /**
     * 保存用户
     *
     * @param sysUser
     */
    void save(SysUser sysUser);
}
