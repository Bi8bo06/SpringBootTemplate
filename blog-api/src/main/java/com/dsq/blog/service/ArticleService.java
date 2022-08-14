package com.dsq.blog.service;

import com.dsq.blog.vo.Result;
import com.dsq.blog.vo.params.PageParams;

public interface ArticleService {
    /**
     * 分页查询 文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);
}
