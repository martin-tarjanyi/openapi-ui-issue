package com.example.openapiuiissue;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController
{
    @GetMapping
    public String demo(MyParameterObject parameterObject)
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
