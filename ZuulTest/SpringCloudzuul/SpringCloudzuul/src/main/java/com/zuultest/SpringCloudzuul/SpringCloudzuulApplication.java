package com.zuultest.SpringCloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudzuulApplication.class, args);
	}

}
