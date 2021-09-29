package com.beyond.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. 整合mybatis-plus
 *      导入依赖
 *      配置： yml 中配置 spring 数据源，导入数据源驱动，在application配置数据库信息
 *            配置mybatis-plus
 *                1. 开启 @MapperScan("")
 *                2. yml 中配置sql 映射文件的位置  mybatis-plus.mapper-locations
 */


@MapperScan("com.beyond.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
