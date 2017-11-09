package com.spring.rk.microservices.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
we will need to have a mechanism that allow us to register new instances of our services automatically (be them support services or core services),
i.e., once the microservice is up, this mechanism will help through a self-register and keep a tracking of the ports, for example.
It is substantial because we need to build a scalable, resilient and fault-tolerant system. Without this mechanism, we would have to maintain a list of ports, servers and be aware of all systems ongoing.

For this purpose, we choose the Netflix Eureka

Eureka is a REST (Representational State Transfer) based service that is primarily
used in the AWS cloud for locating services for the purpose of load balancing and
failover of middle-tier servers.

We call this service, the Eureka Server.
Eureka also comes with a Java-based client component,the Eureka Client,
which makes interactions with the service much easier.
The client also has a built-in load balancer that does basic round-robin load balancing.
At Netflix, a much more sophisticated load balancer wraps Eureka to
provide weighted load balancing based on several factors like traffic, resource usage,
error conditions etc to provide superior resiliency.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}
}
