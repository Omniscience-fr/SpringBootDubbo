package com.springboot.dubbocustom.repository;

import com.springboot.dubbocustom.pojo.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author fr
 * @Date 2020-01-20 10:05
 */
public interface DubboRepository extends JpaRepository<Teacher,Long> {

}
