package com.bfxy.bfxy002springbootmybatisdruid.database;


import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(MybatisMapperScanerConfig.class)
public class MybatisMapperScanerConfig {


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.bfxy.bfxy002springbootmybatisdruid.mapper");
        return  mapperScannerConfigurer;
    }


}
