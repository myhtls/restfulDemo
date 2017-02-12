package com.restfuldemo.common;

import javax.ejb.Startup;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Startup
public class BaseAction {
	
	protected final Logger logger = LoggerFactory.getLogger(getLogClass()) ;
	
	static{
//		logger.info("static....") ;
		java.net.URL log4jPropertiesURL = BaseAction.class.getClassLoader().getResource("/config/log4j.properties") ;
//		logger.info("path = " + log4jPropertiesURL.getPath()) ;
		PropertyConfigurator.configure(log4jPropertiesURL.getPath()) ;
	}
	
//	@PostConstruct
	public void init(){
//		System.out.println("BaseAction.init"); 
		logger.info("BaseAction.init") ;
	}
	
	public Class getLogClass(){
		return this.getClass() ; 
	}

}
