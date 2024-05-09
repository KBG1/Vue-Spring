package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI().components(new Components())
				.info(apiInfo()); 
	}

	private Info apiInfo() {
		return new Info()
				.title("테스트용이에요") 
				.summary("<h3>유저테스트입니다.</h3>") 
				.version("2.0.0"); 
	}
}
