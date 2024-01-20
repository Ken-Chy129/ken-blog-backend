package cn.ken.blog.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/20 14:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = -5196906033420546546L;
    
    private Boolean success;
    
    private Long total;
    
    private List<T> data;
    
    public static <T> PageResult<T> success() {
        PageResult<T> res = new PageResult<>();
        res.setSuccess(true);
        return res;
    }
}
