package com.demo.feign.service.fallback;

import com.demo.feign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * Author：
 * Date：2023/8/1023:15
 * Desc:
 */
@Component
public class FallbackServiceImpl implements FeignService {

    @Override
    public String test(String message) {
        return "Request service has down,this is fallback result";
    }
}
