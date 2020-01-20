package com.springboot.dubboproduct.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author fr
 * @Date 2020-01-20 09:55
 */
@Entity
@Table(name = "student")
@Data
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String sex;
    private int age;
}
