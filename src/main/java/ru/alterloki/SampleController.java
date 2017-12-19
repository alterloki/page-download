package ru.alterloki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@EnableAutoConfiguration
public class SampleController {

    private static Date startTime = null;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! Start time = " + startTime;
    }

    public static void main(String[] args) throws Exception {
        startTime = new Date();
        SpringApplication.run(SampleController.class, args);
    }
}