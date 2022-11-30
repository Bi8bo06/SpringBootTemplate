package com.dsq.blog.controller;

import com.dsq.blog.service.ArticleService;
import com.dsq.blog.vo.Result;
import com.dsq.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 首页 文章列表
     *
     * @param pageParams
     * @return
     */
    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }

    /**
     * 首页 最热文章
     *
     * @return
     */
    @PostMapping("hot")
    public Result hotArticle() {
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    /**
     * 首页 最新文章
     *
     * @return
     */
    @PostMapping("new")
    public Result newArticle() {
        int limit = 5;
        return articleService.newArticle(limit);
    }

    /** 
     * 首页 文章归档
     *
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives() {
        return articleService.listArchives();
    }

    /**
     * 查看文章详情
     *
     * @param id
     * @return
     */
    @PostMapping("detail/{id}")
    public Result findArticleById(@PathVariable("id") Long id) {
        return articleService.findArticleById(id);
    }
}
