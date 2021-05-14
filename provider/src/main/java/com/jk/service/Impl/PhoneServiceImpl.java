package com.jk.service.Impl;

import com.jk.dao.PhoneDao;
import com.jk.pojo.PhoneBean;
import com.jk.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PhoneServiceImpl implements PhoneService {


    @Autowired
    private PhoneDao phoneDao;


    @Override
    public Map findPhone(Integer page, Integer rows, PhoneBean phone) {
        Integer count=phoneDao.count(phone);
        Integer start=(page-1)*rows;
        List<PhoneBean> list=phoneDao.findPhone(start,rows,phone);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("total",count);
        map.put("rows",list);
        return map;
    }

    @Override
    public void del(Integer ids) {
        phoneDao.del(ids);
    }

    @Override
    public void add(PhoneBean phone) {
        if (phone.getId()==null){

            phoneDao.add(phone);
        }else{
            phoneDao.update(phone);
        }
    }

    @Override
    public PhoneBean queryphone(Integer ids) {
        return  phoneDao.queryphone(ids);
    }


}
