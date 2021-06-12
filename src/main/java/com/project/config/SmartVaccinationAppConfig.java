package com.project.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.project.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.project")

public class SmartVaccinationAppConfig implements WebMvcConfigurer {

	// setup view resolver
	@Bean
	public InternalResourceViewResolver ViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	
		messageSource.setBasename("messages");
		
		return messageSource;
	}
	
	@Bean
	public LocalValidatorFactoryBean validator() {
	
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
	localValidatorFactoryBean.setValidationMessageSource(messageSource());
		return localValidatorFactoryBean;
	}
	
	
	@Override
	public Validator getValidator() {
		return validator();
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {

		System.out.println("inside addFormatter");
		registry.addFormatter(new PhoneNumberFormatter());

	}
	
	@Bean
	DriverManagerDataSource getDataSource() {
		
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/wordcount");
		ds.setUsername("root");
        ds.setPassword("A818CAD3");
        return ds;
		
		 
	}
	
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate((javax.sql.DataSource) getDataSource());
	}
}
