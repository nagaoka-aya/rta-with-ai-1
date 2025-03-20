package com.example.config;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateの設定クラス
 */
@Configuration
public class RestTemplateConfig {
    
    /**
     * RestTemplateのBeanを生成する
     * 
     * @param builder RestTemplateBuilder
     * @return 設定済みのRestTemplateインスタンス
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofSeconds(10))
                .setReadTimeout(Duration.ofSeconds(30))
                .build();
    }
}
