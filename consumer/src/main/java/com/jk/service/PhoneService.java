package com.jk.service;

import com.jk.pojo.PhoneBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "provider",fallback = PhoneServiceImpl.class)
public interface PhoneService {

    @GetMapping("phone/findPhone")
    Map findPhone(@RequestParam Integer page, @RequestParam Integer rows, PhoneBean phone);

    @PostMapping("phone/del")
    void del(@RequestParam Integer ids);


    @PostMapping("phone/add")
    void add(PhoneBean phone);
    @GetMapping("phone/queryphone")
    PhoneBean queryphone(@RequestParam Integer ids);







}
