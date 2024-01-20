package cn.ken.blog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/13 18:49
 */
@Getter
@AllArgsConstructor
public enum SystemErrorCodeEnum {
    
    SUCCESS(200, "success"),
    ERROR(500, "system error"),
    ERROR_PARAM(500, "param error"),
    ERROR_PARAM_EMPTY(500, "param empty"),
    ERROR_PARAM_INVALID(500, "param invalid"),
    ERROR_PARAM_INVALID_TYPE(500, "param invalid type"),
    ERROR_PARAM_INVALID_VALUE(500, "param invalid value"),
    ERROR_PARAM_INVALID_LENGTH(500, "param invalid length"),
    ERROR_PARAM_INVALID_RANGE(500, "param invalid range"),
    ;
    
    private final Integer code;
    
    private final String msg;
    
}
