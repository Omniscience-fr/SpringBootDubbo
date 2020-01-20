package com.springboot.dubbocustom.dao.impl;

import com.springboot.dubbocustom.dao.DubboDao;
import com.springboot.dubbocustom.pojo.Teacher;
import com.springboot.dubbocustom.repository.DubboRepository;
import com.springboot.dubboproduct.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author fr
 * @Date 2020-01-20 10:04
 */
@Repository
public class DubboDaoImpl implements DubboDao {

    @Autowired
    private DubboRepository repository;

    @Override
    public void saveAll(List<Student> students) {
        List<Teacher> list = new ArrayList<>();
        for (Student student:students) {
            Teacher teacher = new Teacher();
            teacher.setStudentAge(student.getAge());
            teacher.setStudentName(student.getName());
            teacher.setStudentSex(student.getSex());
            teacher.setTeacherName("小八");
            list.add(teacher);
        }
        repository.saveAll(list);
    }
}
