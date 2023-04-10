package com.wzq.blog.shiro.rest;

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
public class ShiroRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroRestApplication.class, args);
    }

}
