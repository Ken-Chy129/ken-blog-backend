package cn.ken.blog.common.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/20 14:19
 */
@Data
public class PageRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 8472253385961911845L;
    
    /**
     * 页面大小
     */
    private Integer pageSize = 10;

    /**
     * 当前页
     */
    private Integer current = 1;
}
