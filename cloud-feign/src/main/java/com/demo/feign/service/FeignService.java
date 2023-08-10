package com.demo.feign.service;

import com.demo.feign.service.fallback.FallbackServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Author：
 * Date：2023/8/1023:10
 * Desc:
 */
@FeignClient(value = "cloud-provider", fallback = FallbackServiceImpl.class)
public interface FeignService {
    @GetMapping(value = "/test/{message}")
    String test(@PathVariable("message") String message);
}
