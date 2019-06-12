package com.thoughtmechanix.licenses.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class License {
	
	private String id;
	private String organizationId;
	private String productName;
	private String licenseType;
}
