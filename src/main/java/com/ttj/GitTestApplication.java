package com.ttj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println("修改版本之后");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
