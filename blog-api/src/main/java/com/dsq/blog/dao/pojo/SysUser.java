package com.dsq.blog.dao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SysUser {
    //    @TableId(type = IdType.ASSIGN_ID)  //默认id类型
    //用户多了之后，需要考虑分表操作，id需要用分布式id
    private Long id;
    /**
     * 账号
     */
    private String account;
    /**
     * 是否管理员
     */
    private Integer admin;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 注册时间
     */
    private Long createDate;
    /**
     * 是否删除
     */
    private Integer deleted;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 最后登录时间
     */
    private Long lastLogin;
    /**
     * 手机号
     */
    private String mobilePhoneNumber;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 密码
     */
    private String password;
    /**
     * 加密盐
     */
    private String salt;
    /**
     * 状态
     */
    private String status;
}
