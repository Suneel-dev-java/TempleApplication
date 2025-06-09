package com.dgsvtml.focontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgsvtml.dto.UserRegistrationDto;
import com.dgsvtml.service.UserRegistrationService;
import com.dgsvtml.utility.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "User Registration")
public class UserRegistrationControllerImpl implements UserRegistrationController {

	private final UserRegistrationService userRegistrationService;

	@Override
	@PostMapping("v1")
	@Operation(summary = "User Registration", description = "User Registration")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "User Registread Successfully"),
			@ApiResponse(responseCode = "400", description = "Bad Request") })
	public ResponseEntity<Response> saveUserDerails(@RequestBody UserRegistrationDto userRegistrationDto) {
		return userRegistrationService.save(userRegistrationDto);
	}

}
