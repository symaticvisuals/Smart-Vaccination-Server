package com.project.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.project.config.SmartVaccinationAppConfig;

public class SmartVaccinationAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	// REGISTER SPRING CONFIG CLASS
	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = { SmartVaccinationAppConfig.class };
		return arr;
	}

	// FOR URL MAPPING
	@Override
	protected String[] getServletMappings() {
		String arr[] = { "/" };
		return arr;
	}

}
