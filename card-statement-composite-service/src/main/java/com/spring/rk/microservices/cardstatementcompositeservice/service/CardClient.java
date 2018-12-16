package com.spring.rk.microservices.cardstatementcompositeservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "card-service")
//This is the name of the service mapping in the edge/zuul server
public interface CardClient extends CardService{
}
