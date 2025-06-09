package com.dgsvtml.focontroller;

import org.springframework.http.ResponseEntity;

import com.dgsvtml.dto.UserRegistrationDto;
import com.dgsvtml.utility.Response;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "User Registration")
public interface UserRegistrationController {

	ResponseEntity<Response> saveUserDerails(UserRegistrationDto userRegistrationDto);

}
