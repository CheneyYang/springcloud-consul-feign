package com.iooiee.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 2020-09-22
 */

public interface MemberCardService {

    @GetMapping("/getInfoById/{id}")
    public String getInfoById(@PathVariable("id") String id);
}
