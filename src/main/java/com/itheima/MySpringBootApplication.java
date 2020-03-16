package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//声明该类是springboot引导类
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
//        run()表示运行引导类，若@SpringBootApplication写在别的类上，只要修改run方法里的类名即可
        SpringApplication.run(MySpringBootApplication.class);
    }
}
