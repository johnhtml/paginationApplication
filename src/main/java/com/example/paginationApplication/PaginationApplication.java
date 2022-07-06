package com.example.paginationApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class PaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

	//This project was bootstrapped at--
	//https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.1&packaging=jar&jvmVersion=18&groupId=com.example&artifactId=paginationApplication&name=paginationApplication&description=Server%20coded%20in%20Spring%20boot%2C%20this%20server%20allow%20us%20to%20paginate%20large%20amount%20of%20data%20&packageName=com.example.paginationApplication&dependencies=web,mysql,data-jpa,lombok


	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:3000", "http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList(
				"Origin",
				"Access-Control-Allow-Origin",
				"Access-Control-Allow-Credentials",
				"Content-Type",
				"Accept",
				"Jwt-Token",
				"Authorization",
				"Origin, Accept",
				"X-Requested-With",
				"Access-Control-Request-Method",
				"Access-Control-Request-Headers"
		));
		corsConfiguration.setExposedHeaders(Arrays.asList(
				"Origin",
				"Access-Control-Allow-Origin",
				"Access-Control-Allow-Credentials",
				"Content-Type",
				"Accept",
				"Jwt-Token",
				"Authorization",
				"Filename"
		));
		corsConfiguration.setAllowedMethods(Arrays.asList(
				"GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"
		));
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
}