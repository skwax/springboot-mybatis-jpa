package com.skwax.tucu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
@MapperScan("com.skwax.dao.mapper")
@EnableJpaRepositories(basePackages = "com.skwax.dao.jpa")
@EntityScan(basePackages = "com.skwax.pojo")
@ComponentScan(basePackages = {"com.skwax.*"})
public class TucuApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TucuApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TucuApplication.class, args);
    }

}
