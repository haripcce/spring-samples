package com.springdemo.service;

import com.springdemo.dtos.TenantDto;

public interface TenantService {
	public TenantDto create(TenantDto tenantDto);
	public TenantDto get(String tenantGuid);
}
