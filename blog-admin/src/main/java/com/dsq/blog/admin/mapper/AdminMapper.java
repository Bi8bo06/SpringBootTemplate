package com.dsq.blog.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsq.blog.admin.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminMapper extends BaseMapper<Admin> {
}
