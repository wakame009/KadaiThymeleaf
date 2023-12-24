package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("inputValue") String inputValue, RedirectAttributes redirectAttributes) {
        // 入力画面に戻る際に値をパラメータとして渡す
        redirectAttributes.addAttribute("previous", inputValue);
        return "redirect:/input";
    }
}
