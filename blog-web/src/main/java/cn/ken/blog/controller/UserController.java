package cn.ken.blog.controller;

import cn.ken.blog.common.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/1/17 23:45
 */
@RestController
@RequestMapping("/")
public class UserController {

    @PostMapping("/login/account")
    public LoginResult login(LoginParams loginParams) {
        LoginResult loginResult = new LoginResult();
        loginResult.setStatus("ok");
        loginResult.setCurrentAuthority("admin");
        System.out.println(loginParams);
        return loginResult;
    }
    
    @GetMapping("/currentUser")
    public Result<User> getCurrentUser() {
        User user = new User();
        user.setName("123");
        user.setAccess("admin");
        
        return Result.success(user);
    }
}
