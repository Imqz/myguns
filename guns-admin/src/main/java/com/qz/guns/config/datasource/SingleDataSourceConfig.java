package com.qz.guns.config.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qinzhi
 * @date 2018/10/15 17:04
 */
@Configuration
@MapperScan(basePackages = {"com.qz.guns.modular.*.dao"})
public class SingleDataSourceConfig {


}