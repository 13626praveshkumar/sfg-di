package com.springdemo.sfgdi.config;


import com.springdemo.sfgdi.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Java based Spring Configuration
@PropertySource("classpath:datasource.properties")
@Configuration
public class DataSourceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${sfgdi.username}") String username,@Value("${sfgdi.password}")  String password, @Value("${sfgdi.jdbc}") String jdbcUrl)
    {
        FakeDataSource fakeDataSource= new FakeDataSource();
        fakeDataSource.setJdbcUrl(jdbcUrl);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUsername(username);
        return fakeDataSource;
    }
}
