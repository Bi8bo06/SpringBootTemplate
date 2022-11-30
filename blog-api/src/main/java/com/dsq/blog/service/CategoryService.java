package com.dsq.blog.service;

import com.dsq.blog.vo.CategoryVo;
import com.dsq.blog.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(long categoryId);

    Result findAll();
}
