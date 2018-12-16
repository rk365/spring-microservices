package com.spring.rk.microservices.cardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
/*
Telling Eureka that this project is one of his suitable clients to be automatically registered

There are multiple implementations of "Discovery Service" (eureka, consul, zookeeper).
@EnableDiscoveryClient lives in spring-cloud-commons and picks the implementation on the classpath.
@EnableEurekaClient lives in spring-cloud-netflix and only works for eureka.
If eureka is on your classpath, they are effectively the same.
 */
public class CardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardServiceApplication.class, args);
	}
}
