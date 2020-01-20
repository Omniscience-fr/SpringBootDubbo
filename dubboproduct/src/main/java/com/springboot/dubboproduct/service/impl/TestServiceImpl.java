package com.springboot.dubboproduct.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubboproduct.dao.TestDao;
import com.springboot.dubboproduct.entity.Student;
import com.springboot.dubboproduct.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author fr
 * @Date 2020-01-17 16:46
 */
//@Service(timeout = 3000,interfaceClass = TestService.class)
@Service
@org.springframework.stereotype.Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public List<Student> showDubbo() {
        List<Student> all = testDao.findAll();
        return all;
    }
}
