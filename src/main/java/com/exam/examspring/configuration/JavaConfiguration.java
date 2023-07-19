package com.exam.examspring.configuration;


import com.exam.examspring.repository.Question;
import org.springframework.beans.factory.annotation.Value;
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

