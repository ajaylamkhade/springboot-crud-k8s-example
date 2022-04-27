package com.javarunner.springbootcrudk8sexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DbConfig {

    @Bean
    @Profile("mysql")
    public String databaseConfigMysql(){
        System.out.println("active profile is mysql!");
        return "database connected is mysql!";
    }

    @Bean
    @Profile("oracle")
    public String databaseConfigOracle(){
        System.out.println("active profile is oracle!");
        return "database connected is oracle!";
    }

}
