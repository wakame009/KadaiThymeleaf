package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OutputController {
    
    @GetMapping("/output")
    public String getOutput() {
        // output.htmlに画面遷移
        return "output";
    }
    
}