package com.example.openapiuiissue;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController
{
    @GetMapping("1")
    public String demo(MyParameterObject parameterObject)
    {
        return "demo";
    }

    @GetMapping("2")
    public String demo2(@RequestParam String name, @RequestParam int age)
    {
        return "demo";
    }

    @Data
    private static class MyParameterObject
    {
        private String name;
        private int age;
    }
}
