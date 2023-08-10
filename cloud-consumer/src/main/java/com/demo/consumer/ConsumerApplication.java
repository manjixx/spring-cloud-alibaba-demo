package com.demo.consumer;

/**
 * Author：
 * Date：2023/8/1022:55
 * Desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
