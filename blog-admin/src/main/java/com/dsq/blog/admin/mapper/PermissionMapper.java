package com.dsq.blog.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsq.blog.admin.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author daishq
 * @date: 2022/12/15 16:26
 * @description:
 */
@Mapper
@Repository
public interface PermissionMapper extends BaseMapper<Permission> {
    @Select("SELECT * FROM permission where id in (select permission_id from admin_permission where admin_id=#{adminId})")
    List<Permission> findPermissionsByAdminId(Long adminId);
}
