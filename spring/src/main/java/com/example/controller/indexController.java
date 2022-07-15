package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class indexController {

    @GetMapping("/")
    public String index (Model model){
        String tempString = "임의 값을 컨트롤러에서 내보냅니다.";
        List<String> tempList = new ArrayList<>();
        for(int num=0; num<=3; num++){
            tempList.add("tempList" + "[" + num + "]");
        }
        /* model.addAttribute("tempList", tempList);
        model.addAttribute("tempString", tempString);
        */

    return "index";
    }
}
