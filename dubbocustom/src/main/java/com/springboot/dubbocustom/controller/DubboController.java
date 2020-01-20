package com.springboot.dubbocustom.controller;

import com.springboot.dubbocustom.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @Author fr
 * @Date 2020-01-17 17:30
 */
@RestController
public class DubboController {


    @Autowired
    private DubboService dubboService;


    @RequestMapping("/ShowDubbo")
    public String show(){
        dubboService.showDubbo();
        return "消费者调用dubbo";
    }

    @PostConstruct
    public void dubbo(){
        dubboService.showDubbo();
    }


}
