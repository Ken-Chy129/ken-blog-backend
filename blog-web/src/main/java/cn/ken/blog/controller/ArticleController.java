package cn.ken.blog.controller;

import cn.ken.blog.common.model.PageResult;
import cn.ken.blog.common.model.Result;
import cn.ken.blog.domain.dto.ArticleRequestDTO;
import cn.ken.blog.domain.entity.Article;
import cn.ken.blog.service.article.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/13 17:04
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    
    @Resource
    private ArticleService articleService;
    
    @GetMapping("/page")
    public PageResult<Article> article(ArticleRequestDTO articleRequestDTO) {
        System.out.println(articleRequestDTO);
        return articleService.page(articleRequestDTO);
    }
    
    @PostMapping()
    public Result<Boolean> postArticle(@RequestBody Article article) {
        return articleService.save(article);
    }
    
}
