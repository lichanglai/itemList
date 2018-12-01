package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: itemList
 * @Date: 2018/12/1 17:09
 * @Author: lichanglai
 * @Description:
 */
@Controller
@RequestMapping("/miaosha")
public class miaoshaController {


    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("name", "Joshua");
        return "hello";
    }
}
