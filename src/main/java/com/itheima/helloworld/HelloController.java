package com.itheima.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by itheima
 * @Date 2022/3/6
 * @Description
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello World...1");
        System.out.println("Hello World...2");
        System.out.println("Hello World...3");
        System.out.println("Hello World...4");
        return "OK1234";
    }
}
