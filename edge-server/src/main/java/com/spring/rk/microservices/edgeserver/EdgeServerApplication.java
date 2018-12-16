package com.spring.rk.microservices.edgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
//proxy is

//@EnableZuulServer
/*
 first annotation is in charge to say to Eureka that this project is one of his suitable clients
  to be automatically registered.
  The second one tells to Spring that this client will act as a Zuul Server (our Gatekeeper)

	Zuul uses a range of different types of filters that enables us to quickly and nimbly apply functionality to our edge service. These filters help us perform the following functions:

	Authentication and Security – identifying authentication requirements for each resource and rejecting requests that do not satisfy them.
	Insights and Monitoring – tracking meaningful data and statistics at the edge in order to give us an accurate view of production.
	Dynamic Routing – dynamically routing requests to different backend clusters as needed.
	Stress Testing – gradually increasing the traffic to a cluster in order to gauge performance.
	Load Shedding – allocating capacity for each type of request and dropping requests that go over the limit.
	Static Response handling – building some responses directly at the edge instead of forwarding them to an internal cluster
	Multiregion Resiliency – routing requests across AWS regions in order to diversify our ELB usage and move our edge closer to our members
 */
public class EdgeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServerApplication.class, args);
	}
}