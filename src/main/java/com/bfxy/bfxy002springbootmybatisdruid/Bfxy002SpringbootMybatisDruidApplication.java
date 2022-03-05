package com.bfxy.bfxy002springbootmybatisdruid;

import com.bfxy.bfxy002springbootmybatisdruid.entity.MstDict;
import com.bfxy.bfxy002springbootmybatisdruid.mapper.MstDictMapper;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("classpath*:resources/mapper/**/*.xml")
public class Bfxy002SpringbootMybatisDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(Bfxy002SpringbootMybatisDruidApplication.class, args);
    }




}
