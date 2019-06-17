package com.thoughtmechanix.licenses.clients.fallback;

import org.springframework.stereotype.Component;

import com.thoughtmechanix.licenses.clients.OrganizationFeignClient;
import com.thoughtmechanix.licenses.model.Organization;

@Component
public class OrganizationFallback implements OrganizationFeignClient {

	@Override
	public Organization getOrganization(String organizationId) {
		return new Organization();
	}

}
