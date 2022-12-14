package com.dsq.blog.handler;

import com.alibaba.fastjson.JSON;
import com.dsq.blog.dao.pojo.SysUser;
import com.dsq.blog.service.LoginService;
import com.dsq.blog.utils.UserThreadLocal;
import com.dsq.blog.vo.ErrorCode;
import com.dsq.blog.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 */
@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    LoginService loginService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        /**
         * 在执行controller方法（Handler）之前执行
         * 1、需要判断请求的接口路径是否为HandlerMethoud（controller方法）
         * 2、判断token是否为空，如果为空 未登录
         * 3、如果token不为空，登录验证loginService checkToken
         * 4、如果认证成功 放行即可
         */
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        //handler 可能是 RequestResourceHandler springboot 程序 访问静态资源 默认取classpath下的static目录去查询
        String token = request.getHeader("Authorization");
        log.info("==========================reuquest start==========================");
        String requestURI = request.getRequestURI();
        log.info("request uri:{}", requestURI);
        log.info("request method:{}", request.getMethod());
        log.info("token:{}", token);
        log.info("==========================reuquest end==========================");

        if (StringUtils.isBlank(token)) {
            Result result = Result.fail(ErrorCode.NO_LOGIN.getCode(), ErrorCode.NO_LOGIN.getMsg());
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().print(JSON.toJSONString(result));
            return false;
        }

        SysUser sysUser = loginService.checkToken(token);
        if (sysUser == null) {
            Result result = Result.fail(ErrorCode.NO_LOGIN.getCode(), ErrorCode.NO_LOGIN.getMsg());
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().print(JSON.toJSONString(result));
            return false;
        }
        //登录验证成功
        //在controller中 直接获取用户的信息
        UserThreadLocal.put(sysUser);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //如果不删除 ThreadLocal中用完的信息，会有内存泄漏的风险
        UserThreadLocal.remove();
    }
}
