package com.thoughtmechanix.licenses.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.thoughtmechanix.licenses.model.License;

@Service
public class LicenseService {

	
	public License getLicense(String licenseId) {
		return License.builder()
				.id(licenseId)
				.organizationId(UUID.randomUUID().toString())
				.productName("Test product name")
				.licenseType("Perseat")
				.build();
	}

	public void saveLicense(License license) {

	}

	public void updateLicense(License license) {

	}

	public void deleteLicense(License license) {

	}
}
