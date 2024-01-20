package cn.ken.blog.service.article;

import cn.ken.blog.common.model.PageResult;
import cn.ken.blog.common.model.Result;
import cn.ken.blog.domain.dto.ArticleRequestDTO;
import cn.ken.blog.domain.entity.Article;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/13 17:59
 */
public interface ArticleService {
    
    Article selectById(Long id);

    PageResult<Article> page(ArticleRequestDTO articleRequestDTO);

    Result<Boolean> save(Article article);
}
