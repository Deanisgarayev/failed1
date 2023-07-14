package com.exam.examspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Random;

@Configuration
public class JavaConfiguration {
    @Bean
    @Primary
    public Random random() {
        return new Random();
    }
}
