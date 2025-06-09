package com.dgsvtml.service;

import org.springframework.http.ResponseEntity;

import com.dgsvtml.dto.UserRegistrationDto;
import com.dgsvtml.utility.Response;


public interface UserRegistrationService {

	ResponseEntity<Response> save(UserRegistrationDto userRegistrationDto);

}
