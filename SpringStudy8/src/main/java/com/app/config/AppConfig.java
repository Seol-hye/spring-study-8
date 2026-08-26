package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/api.properties") //단일 경로
public class AppConfig {

}
