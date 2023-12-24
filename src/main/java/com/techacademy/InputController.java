package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(value = "previous", required = false) String previous, Model model) {
        // フォームから送信されてきた値をModelに登録        
        model.addAttribute("previous", previous);
        // input.htmlに画面遷移
        return "input";
    }

    @PostMapping("/input")
    public String postInput(@RequestParam("previous") String previous, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("previous", previous);
        // output.htmlに画面遷移
        return "output";
    }
    
}