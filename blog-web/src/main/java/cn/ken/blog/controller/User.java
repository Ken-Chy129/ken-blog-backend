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
 * @since 2024/1/18 0:01
 */
@Data
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = -8638588401560664296L;
    
    private String name;
    private String avatar;
    private String userid;
    private String email;
    private String signature;
    private String title;
    private String group;
    private Object tags;
    private Long notifyCount;
    private Long unreadCount;
    private String country;
    private String access;
    private Object geographic;
    private String address;
    private String phone;
}
