package cn.ken.blog.domain.entity;

import cn.ken.blog.common.model.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 文章实体类
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/13 18:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Article extends BaseDO {
    
    private String name;
    
    private Integer type;
    
    private Long viewCnt;
    
    private Long starCnt;
    
    private Long commentCnt;
    
    private String description;
    
    private Integer status;
}
