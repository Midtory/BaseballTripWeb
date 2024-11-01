package com.baseballtrip.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openAPI() {
		Info info = new Info().title("BaseballTripWeb API 명세서").description(
				"<h3>Hit And Trip API Reference for Developers</h3>Swagger를 이용한 API<br>")
				.version("v1");

		return new OpenAPI().components(new Components()).info(info);
	}
	
}
