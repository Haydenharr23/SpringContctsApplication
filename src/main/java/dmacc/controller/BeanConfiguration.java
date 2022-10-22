package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Contact;

/**
 * Hayden Harris - CIS175 
 * DMACC FALL 2022
 * Oct 19, 2022
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Contact contact() {
		Contact bean = new Contact();
		bean.setName("Dr. Suess");
		bean.setPhone("555-555-5555");
		bean.setRelationship("friend");
		return bean;
	}
	@Bean
	
	public Address address() {
		Address bean = new Address("123 Main Street", "Des Moines", "IA");
		return bean;
	}
}
