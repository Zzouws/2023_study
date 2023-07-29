package com.sky.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @author: zouws
 * @since: 2023/7/22 20:35
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/hello")
    public String test() {
        System.out.println("hello");
        return "hello";
    }
}
