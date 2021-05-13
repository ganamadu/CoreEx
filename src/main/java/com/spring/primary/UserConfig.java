package com.spring.primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class UserConfig {
	
	@Bean
	public User getAdminUser() {
		return new AdminUser();
	}
	
	@Primary
	@Bean
	public User getGuestUser() {
		return new GuestUser();
	}

}
