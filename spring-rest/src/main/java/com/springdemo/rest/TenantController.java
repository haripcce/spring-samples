package com.springdemo.rest;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.dtos.TenantDto;
import com.springdemo.service.TenantService;

@RestController
public class TenantController {
	@Autowired
	private TenantService tenantService;

	@RequestMapping(value = "/tenant", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity create(@RequestBody TenantDto tenantDto) {
		return new ResponseEntity<TenantDto>(tenantService.create(tenantDto), HttpStatus.CREATED);

	}

	@RequestMapping(value = "/tenant/{tenantGuid}", method = RequestMethod.GET, consumes = {
			MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity create(@PathVariable String tenantGuid) {

		return new ResponseEntity<TenantDto>(tenantService.get(tenantGuid), HttpStatus.OK);

	}

}
