package com.jk.dao;

import com.jk.pojo.PhoneBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PhoneDao {
    Integer count(@Param("phone") PhoneBean phone);

    List<PhoneBean> findPhone(@Param("start")Integer start, @Param("rows")Integer rows, @Param("phone")PhoneBean phone);

    void del(Integer ids);

    void add(PhoneBean phone);

    PhoneBean queryphone(Integer ids);

    void update(PhoneBean phone);
}
