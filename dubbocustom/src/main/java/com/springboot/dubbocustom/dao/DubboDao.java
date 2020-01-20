package com.springboot.dubbocustom.dao;


import com.springboot.dubboproduct.entity.Student;

import java.util.List;

/**
 * @Author fr
 * @Date 2020-01-20 10:03
 */
public interface DubboDao {

    public void saveAll(List<Student> students);
}
