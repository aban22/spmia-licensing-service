package com.thoughtmechanix.licenses.clients;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thoughtmechanix.licenses.clients.fallback.OrganizationFallback;
import com.thoughtmechanix.licenses.model.Organization;
//https://github.com/OpenFeign/feign/wiki/Custom-error-handling
@RibbonClient
@FeignClient(name = "spmia-organization-service", fallback = OrganizationFallback.class)
public interface OrganizationFeignClient {
 
	@GetMapping(value="/v1/organizations/{organizationId}")
    Organization getOrganization(@PathVariable("organizationId") String organizationId);
}