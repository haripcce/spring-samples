package com.springdemo.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springdemo.dtos.TenantDto;
import com.springdemo.service.TenantService;

@Service
public class TenantServiceImpl implements TenantService {

	static Map<String, TenantDto> tempDataMap = new HashMap<String, TenantDto>();

	public TenantDto create(TenantDto tenantDto) {
		tenantDto.setId(1l);
		tenantDto.setTenantGuid(UUID.randomUUID().toString());
		tempDataMap.put(tenantDto.getTenantGuid(), tenantDto);
		return tenantDto;
	}

	public TenantDto get(String tenantGuid) {
		// TODO Auto-generated method stub
		return tempDataMap.get(tenantGuid);
	}

}
