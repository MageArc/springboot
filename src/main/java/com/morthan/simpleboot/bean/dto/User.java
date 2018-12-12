package com.morthan.simpleboot.bean.dto;

import lombok.Data;

/**
 * <p>名称 :  </p>
 * <p>版本 : 1.0 </p>
 * <p>作者 : M.chen </p>
 * <p>日期 : 2018/12/12 </p>
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}