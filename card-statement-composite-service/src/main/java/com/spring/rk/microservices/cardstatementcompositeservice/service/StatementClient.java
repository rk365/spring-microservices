package com.spring.rk.microservices.cardstatementcompositeservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "statement-service")
public interface StatementClient extends StatementService {
}
