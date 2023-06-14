package com.ttj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println("推送之后的版本");
        System.out.println("修改版本之后1");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
