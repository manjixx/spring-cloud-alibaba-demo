package com.demo.provider;

/**
 * Author：
 * Date：2023/8/1022:50
 * Desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
