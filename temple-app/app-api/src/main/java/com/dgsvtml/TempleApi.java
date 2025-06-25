package com.dgsvtml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Temple Application",
version = "v1.0.0", 
description = "This endpoints manages the all temple front office application inforamtion"))
public class TempleApi {

	public static void main(String[] args) {
		SpringApplication.run(TempleApi.class, args);
	}

}
