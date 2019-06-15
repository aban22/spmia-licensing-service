package com.thoughtmechanix.licenses.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.thoughtmechanix.licenses.config.ServiceConfig;
import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.repository.LicenseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LicenseService {

	private final LicenseRepository licenseRepository;
	private final ServiceConfig config;
	
	public License getLicense(String organizationId, String licenseId) {
		License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
		return license.withComment(config.getExampleProperty());
	}
	
	public List<License> getLicense(String organizationId) {
		return licenseRepository.findByOrganizationId(organizationId);
	}

	public void saveLicense(License license) {
		license.withId(UUID.randomUUID().toString());
		licenseRepository.save(license);
	}

	public void updateLicense(License license) {

	}

	public void deleteLicense(License license) {

	}
}
