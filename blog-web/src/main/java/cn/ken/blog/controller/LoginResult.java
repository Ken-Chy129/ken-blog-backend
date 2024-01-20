package cn.ken.blog.controller;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/17 23:52
 */
@Data
public class LoginResult implements Serializable {

    @Serial
    private static final long serialVersionUID = 756915066956429946L;
    
    private String status;
    
    private String currentAuthority;
}
