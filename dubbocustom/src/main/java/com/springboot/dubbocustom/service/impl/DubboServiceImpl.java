package com.springboot.dubbocustom.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbocustom.dao.DubboDao;
import com.springboot.dubbocustom.service.DubboService;
import com.springboot.dubboproduct.entity.Student;
import com.springboot.dubboproduct.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author fr
 * @Date 2020-01-17 18:21
 */
//@Service
@org.springframework.stereotype.Service
public class DubboServiceImpl implements DubboService {

    @Reference(interfaceClass = TestService.class)
//    @Reference
    private TestService testService;

    @Autowired
    private DubboDao dubboDao;

    @Override
    public void showDubbo() {
        List<Student> students = testService.showDubbo();
        dubboDao.saveAll(students);
    }
}
