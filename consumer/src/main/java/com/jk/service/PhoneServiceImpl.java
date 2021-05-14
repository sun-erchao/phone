package com.jk.service;

import com.jk.pojo.PhoneBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Component
public class PhoneServiceImpl implements PhoneService {
    @Override
    public Map findPhone(Integer page, Integer rows, PhoneBean phone) {

        HashMap<Object, Object> map = new HashMap<>();
        map.put("total",0);
        map.put("rows",0);

        return map;
    }

    @Override
    public void del(Integer ids) {

    }

    @Override
    public void add(PhoneBean phone) {

    }

    @Override
    public PhoneBean queryphone(Integer ids) {
        return null;
    }
}
