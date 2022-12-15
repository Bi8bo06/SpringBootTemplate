package com.dsq.blog.admin.model.params;

import lombok.Data;

/**
 * @author daishq
 * @date: 2022/12/15 15:57
 * @description:
 */
@Data
public class PageParam {

    private Integer currentPage;

    private Integer pageSize;

    private String queryString;
}
