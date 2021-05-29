package crunch.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/butik")
    public String butik() {
        return "butik";
    }

    @GetMapping("/supportcase")
    public String supportcase() {
        return "support_cases_modal";
    }
}
