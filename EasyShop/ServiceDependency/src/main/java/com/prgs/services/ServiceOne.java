package com.prgs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOne {
	
	@Autowired
	
	private ServiceTwo service;
	
	 
  public void test() {
	  System.out.println("This is ServiceTwo-test() ");
	  service.test();}
	  
  

  public void setService(ServiceTwo Service) {
	  }
  }
  

