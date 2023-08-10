package com.demo.consumer.config;

/**
 * Author：
 * Date：2023/8/1022:57
 * Desc:
 */
@Configuration
public class ConsumerConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
