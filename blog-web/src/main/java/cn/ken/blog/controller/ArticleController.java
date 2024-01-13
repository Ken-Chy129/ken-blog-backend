package cn.ken.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/13 17:04
 */
@RestController
public class ArticleController {
    
    @GetMapping("article")
    public String article() {
        return "article";
    }
    
}
