package cn.ken.blog.service.article.impl;

import cn.ken.blog.common.model.PageResult;
import cn.ken.blog.common.model.Result;
import cn.ken.blog.domain.dto.ArticleRequestDTO;
import cn.ken.blog.domain.entity.Article;
import cn.ken.blog.mapper.ArticleMapper;
import cn.ken.blog.service.article.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/13 18:00
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    
    @Resource
    private ArticleMapper articleMapper;
    
    @Override
    public Article selectById(Long id) {
        return articleMapper.selectById(id);
    }

    @Override
    public PageResult<Article> page(ArticleRequestDTO articleRequestDTO) {
        PageResult<Article> result = PageResult.success();
        Article article = articleMapper.selectById(1);
        result.setData(List.of(article));
        return result;
    }

    @Override
    public Result<Boolean> save(Article article) {
        Result<Boolean> result = Result.success(true);
        int insert = articleMapper.insert(article);
        if (insert < 0) {
            result.setData(false);
        }
        return result;
    }
}
