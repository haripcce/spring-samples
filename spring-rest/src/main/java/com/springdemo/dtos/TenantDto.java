package com.springdemo.dtos;

public class TenantDto {
	private Long id;
	private String name;
	private String tenantGuid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTenantGuid() {
		return tenantGuid;
	}

	public void setTenantGuid(String tenantGuid) {
		this.tenantGuid = tenantGuid;
	}

}
