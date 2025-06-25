package com.dgsvtml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Temple Back Office Application",
version = "v1.0.0", 
description = "This endpoints manages the all temple back office application inforamtion"))
public class TempleBoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempleBoApplication.class, args);
	}
}
