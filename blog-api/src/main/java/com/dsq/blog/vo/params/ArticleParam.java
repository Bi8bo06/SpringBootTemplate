package com.dsq.blog.vo.params;

import com.dsq.blog.vo.CategoryVo;
import com.dsq.blog.vo.TagVo;
import lombok.Data;

import java.util.List;

/**
 * @author daishq
 * @date: 2022/12/6 16:26
 * @description:
 */
@Data
public class ArticleParam {
    private Long id;

    private ArticleBodyParam body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;
}
