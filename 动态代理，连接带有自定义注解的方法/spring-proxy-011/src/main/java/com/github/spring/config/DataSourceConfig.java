package com.github.spring.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.github.spring.aop.LogHandler;
import com.github.spring.service.SysLogService;
import com.github.spring.service.impl.SysLogServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@ComponentScan("com.github.spring")
@Configuration
@EnableAspectJAutoProxy
public class DataSourceConfig {


    /**
     * 配置连接池，
     * @return
     * @throws Exception
     */
    @Bean("slaveDataSource")
    //@Profile("master")
    @Primary
    public DataSource slaveDataSource() throws Exception{
        //将获取信息存放到Map中在将Map存入数据源对象
        Map<String ,String > map = new HashMap<>();
        map.put(DruidDataSourceFactory.PROP_DRIVERCLASSNAME,"com.mysql.cj.jdbc.Driver");
        map.put(DruidDataSourceFactory.PROP_USERNAME,"root");
        map.put(DruidDataSourceFactory.PROP_PASSWORD,"333###");
        map.put(DruidDataSourceFactory.PROP_URL,"jdbc:mysql://localhost:3306/timo?characterEncoding=utf-8");
        DataSource dataSource = DruidDataSourceFactory.createDataSource(map);
        return dataSource;
    }


/**
     * 获取数据库连接对象
     * @return
     * @throws Exception
     *//*
    @Bean(name = "masterDataSource")
    @Profile("dev")
    @Primary
    public DataSource masterDataSource() throws Exception{
        //将获取信息存放到Map中在将Map存入数据源对象
        Map<String ,String > map = new HashMap<>();
        map.put(DruidDataSourceFactory.PROP_DRIVERCLASSNAME,"com.mysql.jdbc.Driver");
        map.put(DruidDataSourceFactory.PROP_USERNAME,"root");
        map.put(DruidDataSourceFactory.PROP_PASSWORD,"333###");
        map.put(DruidDataSourceFactory.PROP_URL,"jdbc:mysql://localhost:3306/timo");
        DataSource dataSource = DruidDataSourceFactory.createDataSource(map);
        return dataSource;
    }*/


    //使用JDBCTemplate接连
    @Bean("jdbcTemplate")
    public JdbcTemplate jdbcTemplate() throws Exception{
        return new JdbcTemplate(slaveDataSource());
    }



    @Bean(name = "logHandler")
    public LogHandler logHandler(){
        return new LogHandler();
    }














}
