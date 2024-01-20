package cn.ken.blog.domain.dto;

import cn.ken.blog.common.model.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/20 14:18
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ArticleRequestDTO extends PageRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1882906709050469382L;
    
    private String title;
    
    private String status;
    
}
