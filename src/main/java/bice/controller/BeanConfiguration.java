package bice.controller;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import bice.beans.Computer;

/**
 * @author Jamison Bice - jdbice CIS175 - Fall 2021 Oct 21, 2021
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Computer computer() {
		Computer bean = new Computer("ASUS Gaming", 'X', (short) 2017, 2999.99);
		
		return bean;
	}

	


}
