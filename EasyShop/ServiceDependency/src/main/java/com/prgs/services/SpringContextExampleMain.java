package com.prgs.services;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextExampleMain {


	public static void main(String[] args) {
		// ServiceOne service = new ServiceOne();
		
//	AnnotationConfigApplicationContext applicationContext 
//	= new AnnotationConfigApplicationContext(SpringConfig.class);
		ClassPathXmlApplicationContext applicationcontext = 
		    	  new ClassPathXmlApplicationContext(new String[] {"Services.xml"});
	ServiceOne service = applicationcontext.getBean(ServiceOne.class);
		service.test();
	}
}