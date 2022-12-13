package com.dsq.blog.controller;

import com.dsq.blog.service.TagService;
import com.dsq.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tags")
public class TagsController {
    @Autowired
    private TagService tagService;

    @GetMapping("hot")
    public Result hot() {
        int limit = 2;
        return tagService.hots(limit);
    }

    public Result findAll() {
        return tagService.findAll();
    }

    @GetMapping("detail")
    public Result findAllDetail() {
        return tagService.findAllDetail();
    }

    @GetMapping("detail/{id}")
    public Result findDetailById(@PathVariable("id") Long id) {
        /**
         * 查询所有文章标签下所有的文章
         * @return
         */
        return tagService.findDetailById(id);
    }
}
