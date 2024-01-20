package cn.ken.blog.common.exception;

import lombok.Getter;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/13 18:53
 */
@Getter
public class BusinessException extends RuntimeException {

    private final String code;

    private final String desc;
    
    public BusinessException(String code, String desc) {
        super(desc);
        this.code = code;
        this.desc = desc;
    }
}
