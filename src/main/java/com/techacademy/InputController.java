package com.techacademy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @Value("${fixed.text}")
    private String fixedText;

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String previous, Model model) {
        if (previous != null) {
            model.addAttribute("previousMessage", "前回入力された値は「" + previous + "」でした。");
        }
        model.addAttribute("fixedText", fixedText);
        return "input";
    }
}