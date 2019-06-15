package com.thoughtmechanix.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class SpmiaLicensingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmiaLicensingServiceApplication.class, args);
	}

}
