package com.sakura.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by osx on 2017/9/5.
 */
@EnableEurekaClient
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(UserApplication.class).web(true).run(args);
    }
}
