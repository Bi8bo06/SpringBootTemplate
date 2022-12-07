package com.dsq.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsq.blog.dao.pojo.ArticleTag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author daishq
 * @date: 2022/12/6 16:31
 * @description:
 */
@Mapper
@Repository
public interface ArticleTagMapper extends BaseMapper<ArticleTag> {
}
