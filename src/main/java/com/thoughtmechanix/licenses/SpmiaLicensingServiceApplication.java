package com.thoughtmechanix.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@RefreshScope
@SpringBootApplication
public class SpmiaLicensingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmiaLicensingServiceApplication.class, args);
	}

}
