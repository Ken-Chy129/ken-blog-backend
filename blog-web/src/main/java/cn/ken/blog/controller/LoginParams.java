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
 * @since 2024/1/17 23:51
 */
@Data
public class LoginParams implements Serializable {

    @Serial
    private static final long serialVersionUID = -5556654721574943037L;
    
    private String username;
    
    private String password;
    
    private Boolean autoLogin;
}
