package com.iooiee.springcloud.controller;

import com.iooiee.springcloud.service.BaseMemberCardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 2020-09-22
 */
@RestController
public class BaseMemberCardController {
    @Resource
    BaseMemberCardService baseMemberCardService;

    @GetMapping("info/{id}")
    public void getInfo(@PathVariable("id") String id){
        String paymentById = baseMemberCardService.getPaymentById(id);
        System.out.println("返回客户端数据："+ paymentById);
    }
}
