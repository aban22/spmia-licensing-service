package com.thoughtmechanix.licenses.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.services.LicenseService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

	private final LicenseService licenseService;

	@GetMapping("/{licenseId}")
	public License getLicense(@PathVariable("organizationId") String organizationId, @PathVariable("organizationId") String licenseId) {

//		licenseService.getLicense(licenseId);
		return License.builder()
				.id(licenseId)
				.organizationId(organizationId)
				.productName("Teleco")
				.licenseType("Seat")
				.build();
	}

	@PutMapping("{licenseId}")
	public String updateLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the put");
	}

	@PostMapping("{licenseId}")
	public String saveLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the post");
	}

	@DeleteMapping("{licenseId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the Delete");
	}
}
