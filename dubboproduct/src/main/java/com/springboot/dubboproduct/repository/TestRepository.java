package com.springboot.dubboproduct.repository;

import com.springboot.dubboproduct.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author fr
 * @Date 2020-01-20 09:59
 */
public interface TestRepository extends JpaRepository<Student,Long> {
}
