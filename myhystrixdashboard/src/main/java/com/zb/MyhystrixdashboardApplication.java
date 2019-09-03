package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
//张三丰
public class MyhystrixdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyhystrixdashboardApplication.class, args);
    }

}
