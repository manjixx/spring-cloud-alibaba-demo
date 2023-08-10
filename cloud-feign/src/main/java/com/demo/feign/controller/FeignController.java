package com.demo.feign.controller;

import com.demo.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：
 * Date：2023/8/1023:11
 * Desc:
 */
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/test/hi")
    public String test() {
        return feignService.test("Hi Feign");
}
