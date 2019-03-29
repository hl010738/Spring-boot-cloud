package com.spring.bootcloud;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

/*
    java 代码
 */
@SpringBootApplication
@RestController
public class BootCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootCloudApplication.class, args);

//        SpringApplication springApplication = new SpringApplication(BootCloudApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//
//        springApplication.run(args);
    }
}
