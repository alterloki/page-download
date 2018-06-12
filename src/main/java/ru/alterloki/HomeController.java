package ru.alterloki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    String home() {
        return "index";
    }

}