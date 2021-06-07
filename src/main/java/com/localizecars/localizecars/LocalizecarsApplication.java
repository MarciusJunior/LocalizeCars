package com.localizecars.localizecars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.google.common.net.HttpHeaders;

@SpringBootApplication
public class LocalizecarsApplication {

	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder.baseUrl("https://parallelum.com.br/fipe/api/v1/carros")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizecarsApplication.class, args);
	}

}