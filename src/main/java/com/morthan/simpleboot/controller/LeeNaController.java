package com.morthan.simpleboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>名称 :  </p>
 * <p>版本 : 1.0 </p>
 * <p>作者 : M.chen </p>
 * <p>日期 : 2018/12/6 </p>
 */
@RestController
public class LeeNaController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private Integer age;

    @RequestMapping("/leena")
    public String leeNa() {
        return name + ":" + age;
    }
}
