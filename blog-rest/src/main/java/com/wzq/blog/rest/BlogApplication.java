package com.wzq.blog.rest;

//import org.mybatis.spring.annotation.MapperScan;
import com.wzq.blog.base.configuration.BaseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@EnableCaching
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients
@Import(BaseConfiguration.class)
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
