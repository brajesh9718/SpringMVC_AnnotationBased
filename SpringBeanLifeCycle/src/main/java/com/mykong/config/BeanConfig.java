package com.mykong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mykong.bean.Address;
import com.mykong.bean.EmployeeBean;

@Configuration
public class BeanConfig {

	@Bean
	@Scope("singleton")
	public EmployeeBean employeeBean() {
		return new EmployeeBean(address());
	}

	@Bean
	@Scope("prototype")
	public Address address() {
		return new Address();
	}
}