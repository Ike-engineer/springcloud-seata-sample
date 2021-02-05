package com.zxs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Package：com.warape.seatstorage.filter
 * @Table
 * @Description:
 * @Author：ZhangXuSheng
 * @QQ：a15873194117@163.com
 * @Date： 2021/2/5
 * @Version V1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})  //排除自动配置
@EnableDiscoveryClient
@MapperScan("com.zxs.mapper")
@EnableFeignClients
public class SeatOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeatOrderApplication.class,args);
    }
}
