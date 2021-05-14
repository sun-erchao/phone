package com.jk.controller;

import com.jk.pojo.PhoneBean;
import com.jk.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("phone")
public class PhoneController {


    @Autowired
    private PhoneService phoneService;

    @RequestMapping("findPhone")
    @ResponseBody
    public Map findPhone(Integer page, Integer rows,@RequestBody PhoneBean phone){
        return phoneService.findPhone(page,rows,phone);
    }

    @RequestMapping("del")
    @ResponseBody
    public void del(Integer ids){
        phoneService.del(ids);
    }

    @RequestMapping("add")
    @ResponseBody
    public void add(@RequestBody PhoneBean phone){
        phoneService.add(phone);
    }

    @RequestMapping("queryphone")
    @ResponseBody
    public PhoneBean queryphone(Integer ids){
        return phoneService.queryphone(ids);
    }


}
