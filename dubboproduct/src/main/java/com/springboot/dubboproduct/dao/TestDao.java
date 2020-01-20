package com.springboot.dubboproduct.dao;

import com.springboot.dubboproduct.entity.Student;

import java.util.List;

/**
 * @Author fr
 * @Date 2020-01-20 09:54
 */
public interface TestDao {

    public List<Student> findAll();
}
