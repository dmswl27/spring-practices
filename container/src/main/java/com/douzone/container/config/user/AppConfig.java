package com.douzone.container.config.user;

import org.springframework.context.annotation.Bean;

import com.douzone.container.user.User;

public class AppConfig {
	@Bean
	public User user() {
		return new User();
	}
}
