package com.thoughtmechanix.licenses.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DiscoveryService {

	private final RestTemplate restTemplate;
	private final DiscoveryClient discoveryClient;

	public List getEurekaServices() {
		List<String> services = new ArrayList<String>();

		discoveryClient.getServices().forEach(serviceName -> {
			discoveryClient.getInstances(serviceName).forEach(instance -> {
				services.add(String.format("%s:%s", serviceName, instance.getUri()));
			});
		});

		return services;
	}

}