package com.example.springboot.controller;

import com.example.springboot.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(IndexController.class);
    /* **************** final 생성자 주입 **************** */
    private final IndexService indexService;

    /* final 생성자 주입 */
    /* 불변과 오류방지를 위해 final을 사용하는 방법을 사용할 것. */
    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    /* **************** final 영역 종료 **************** */

    @GetMapping({"/", ""})
    public String index (Model model){
        logger.info("info : Test");
        String temp = "Temp Data";
        model.addAttribute("temp", temp);

        return "index";
    }
}
