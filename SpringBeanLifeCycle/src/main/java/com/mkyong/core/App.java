package com.mkyong.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mykong.bean.EmployeeBean;
import com.mykong.config.BeanConfig;

public class App {

	public static void main(String[] args) throws Exception {

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		EmployeeBean employeeBean = appContext.getBean(EmployeeBean.class);
		EmployeeBean employeeBean1 = appContext.getBean(EmployeeBean.class);
		System.out.println("employeeBeanID :: " + employeeBean.hashCode());
		System.out.println("employeeBean1ID :: " + employeeBean1.hashCode());
		System.out.println("ID :: " + employeeBean.getEmployeeId());
		appContext.close();
	}
}