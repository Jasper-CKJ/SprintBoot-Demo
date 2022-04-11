package com.jasper.mybatis.pagehelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.jasper.mybatis.pagehelper.mapper"})
public class DemoMybatisPageHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisPageHelperApplication.class, args);
    }

}
