package com.jk.service;

import com.jk.pojo.PhoneBean;

import java.util.Map;

public interface PhoneService {
    Map findPhone(Integer page, Integer rows, PhoneBean phone);

    void del(Integer ids);

    void add(PhoneBean phone);

    PhoneBean queryphone(Integer ids);
}
