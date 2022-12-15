package com.dsq.blog.admin.vo;

import lombok.Data;

import java.util.List;

/**
 * @author daishq
 * @date: 2022/12/15 16:40
 * @description:
 */
@Data
public class PageResult<T> {
    private List<T> list;

    private Long total;
}
