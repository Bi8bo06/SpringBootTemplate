package com.dsq.blog.dao.pojo;

import lombok.Data;

/**
 * @author daishq
 * @date: 2022/12/6 16:30
 * @description:
 */
@Data
public class ArticleTag {
    private Long id;

    private Long articleId;

    private Long tagId;
}
