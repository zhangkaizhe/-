package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XAGlf-A on 2019/9/3.
 */
@RestController
@SpringBootApplication
//@MapperScan("com.test.dao")
public class SpringBootApplicationDemo {
    @RequestMapping(value = "/")
    public String index(){
        return "This is my first spring boot project!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationDemo.class,args);
    }

}
