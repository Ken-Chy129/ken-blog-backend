package cn.ken.blog.common.model;

import lombok.Data;

import java.util.Date;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/13 18:40
 */
@Data
public class BaseDO {
    
    private Long id;
    
    private Date gmtCreate;
    
    private Date gmtModified;
}
