package com.dsq.blog.service;

import com.dsq.blog.dao.pojo.SysUser;
import com.dsq.blog.vo.Result;
import com.dsq.blog.vo.params.LoginParam;
import org.springframework.transaction.annotation.Transactional;

@Transactional  //事务注解
public interface LoginService {

    /**
     * 登录功能
     *
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    /**
     * 退出登录
     *
     * @param token
     * @return
     */
    Result logout(String token);

    /**
     * 注册
     *
     * @param loginParam
     * @return
     */
    Result register(LoginParam loginParam);
}
