package com.dsq.blog.service;

import com.dsq.blog.vo.Result;
import com.dsq.blog.vo.TagVo;

import java.util.List;

public interface TagService {
    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);
}
