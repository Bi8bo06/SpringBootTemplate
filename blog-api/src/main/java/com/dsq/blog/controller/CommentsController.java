package com.dsq.blog.controller;

import com.dsq.blog.service.CommentsService;
import com.dsq.blog.vo.Result;
import com.dsq.blog.vo.params.CommentParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comments")
public class CommentsController {
    @Autowired
    CommentsService commentsService;

    /**
     * 评论 评论列表
     *
     * @return
     */
    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long id) {
        return commentsService.commentsByArticleId(id);
    }

    /**
     * 评论 新增评论
     *
     * @return
     */
    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam) {
        return commentsService.comment(commentParam);
    }
}
