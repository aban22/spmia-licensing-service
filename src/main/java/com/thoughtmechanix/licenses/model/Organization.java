package com.thoughtmechanix.licenses.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Organization {

	String id;
	String name;
	String contactName;
	String contactEmail;
	String contactPhone;
	
}
