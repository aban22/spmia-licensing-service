package com.thoughtmechanix.licenses.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thoughtmechanix.licenses.model.Organization;

@FeignClient("organizationservice")
public interface OrganizationFeignClient {
 
	@GetMapping(value="/v1/organizations/{organizationId}", consumes="application/json")
    Organization getOrganization(@PathVariable("organizationId") String organizationId);
}