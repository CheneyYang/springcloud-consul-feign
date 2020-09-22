package com.iooiee.springcloud.service;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 2020-09-22
 */
@Component
@FeignClient("consul-provider-payment")
public interface BaseMemberCardService {

    @GetMapping(value="/getInfoById/{id}")
    public String getPaymentById(@PathVariable("id") String id);
}
