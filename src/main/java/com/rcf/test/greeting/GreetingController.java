package com.rcf.test.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// https://spring.io/guides/gs/serving-web-content/#scratch

@Controller
public class GreetingController {

    @GetMapping("/")
    public String index(
            @RequestParam(name="name",required = false, defaultValue = "World")
            String name,
            Model model
    )
    {
        model.addAttribute("name",name);
        return "index";
    }
}
