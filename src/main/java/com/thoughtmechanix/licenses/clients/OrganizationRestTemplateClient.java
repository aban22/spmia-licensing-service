package com.thoughtmechanix.licenses.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;

import com.thoughtmechanix.licenses.model.Organization;
import com.thoughtmechanix.licenses.utils.UserContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class OrganizationRestTemplateClient {

	@Autowired
    private OAuth2RestTemplate restTemplate;
	
	@Autowired
	private UserContext userContext;
	
	public Organization getOrganization(String organizationId){
        log.debug("In Licensing Service.getOrganization: {}", userContext.getCorrelationId());

        ResponseEntity<Organization> restExchange =
                restTemplate.exchange(
                        "http://localhost:5555/api/organization/v1/organizations/{organizationId}",
                        HttpMethod.GET,
                        null, Organization.class, organizationId);

        return restExchange.getBody();
    }
}
