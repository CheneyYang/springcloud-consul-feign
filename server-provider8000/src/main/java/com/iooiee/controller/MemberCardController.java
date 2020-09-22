package com.iooiee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 2020-09-22
 */
@RestController
public class MemberCardController {

    @GetMapping("/getInfoById/{id}")
    public String getInfoById(@PathVariable("id") String id){
        return "收到请求传过来的ID："+ id;
    }
}
