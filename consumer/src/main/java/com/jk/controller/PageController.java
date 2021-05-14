package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("show")
    public String show(){
        return "show";
    }
    @RequestMapping("add")
    public String add(){
        return "add";
    }
}
