package com.zxs.config;

import com.alibaba.druid.pool.DruidDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Package：com.warape.seatorder.config
 * @Table
 * @Description:
 * @Author：ZhangXuSheng
 * @QQ：a15873194117@163.com
 * @Date： 2021/2/5
 * @Version V1.0
 */

@Configuration
public class SeataConfig {


    /**
     * 配置DataSource
     */
    @Bean("druid-datasource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDruidDataSource() {
        return new DruidDataSource();
    }

    /**
     * 配置seata代理
     */
    @Primary
    @Bean
    public DataSource getProxyDataSource(@Qualifier("druid-datasource") DataSource source) {
        return new DataSourceProxy(source);
    }
}
