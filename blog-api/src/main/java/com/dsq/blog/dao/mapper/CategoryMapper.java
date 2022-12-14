package com.dsq.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsq.blog.dao.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CategoryMapper extends BaseMapper<Category> {
}