package com.zxs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package：com.warape.seatstorage.filter
 * @Table
 * @Description:
 * @Author：ZhangXuSheng
 * @QQ：a15873194117@163.com
 * @Date： 2021/2/5
 * @Version V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zxs.mapper")
public class SeatStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeatStorageApplication.class, args);
    }
}
