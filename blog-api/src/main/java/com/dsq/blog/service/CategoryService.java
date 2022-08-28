package com.dsq.blog.service;

import com.dsq.blog.vo.CategoryVo;

import java.util.List;

public interface CategoryService {
    CategoryVo findCategoryById(long categoryId);
}
