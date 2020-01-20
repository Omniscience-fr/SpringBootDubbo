package com.springboot.dubboproduct.dao.impl;

import com.springboot.dubboproduct.dao.TestDao;
import com.springboot.dubboproduct.entity.Student;
import com.springboot.dubboproduct.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author fr
 * @Date 2020-01-20 09:58
 */
@Repository
public class TestDaoImpl implements TestDao {
    @Autowired
    private TestRepository repository;

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }
}
