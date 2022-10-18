package com.mykong.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class EmployeeBean implements BeanNameAware,BeanClassLoaderAware,BeanFactoryAware, InitializingBean, DisposableBean,
		BeanPostProcessor {

	Address address;

	public EmployeeBean(Address address) {
		this.address = address;
		System.out.println("Parameterized EmployeeBean Constructor......");
	}

	public int getEmployeeId() {
		address.getAdd();
		return 101;

	}

	@PostConstruct
	public void init() {
		System.out.println("Method @PostConstruct() invoked...");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("Method customDestroy() invoked...");
	}

	public void close() {
		System.out.println("Close ....");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean :: afterPropertiesSet()");
	}

	public void setBeanName(String name) {
		System.out.println("BeanNameAware Bean Name ::  " + name);
	}

	public void destroy() throws Exception {
		System.out.println("destory()");
	}

	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("BeanClassLoaderAware :: " + classLoader.getParent());
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware :: " + beanFactory.getBean("employeeBean"));
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("PostProcessBeforeInitialization :: " + bean + " BeanName " + beanName);
		return null;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("PostProcessAfterInitialization :: " + bean + " BeanName " + beanName);
		return null;
	}

}
