package com.dgsvtml.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dgsvtml.config.MessageCode;
import com.dgsvtml.dto.UserRegistrationDto;
import com.dgsvtml.entity.UserRegistration;
import com.dgsvtml.repository.UserRegistrationRepository;
import com.dgsvtml.service.UserRegistrationService;
import com.dgsvtml.utility.Response;
import com.dgsvtml.utility.ResponseUtility;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserRegistrationServiceImpl implements UserRegistrationService {

	private final UserRegistrationRepository userRegistrationRepository;
	private final ResponseUtility responseUtility;
	private final ModelMapper mapper;

	@Override
	public ResponseEntity<Response> save(UserRegistrationDto userRegistrationDto) {
		try {
			UserRegistration userRegistration = mapper.map(userRegistrationDto, UserRegistration.class);
			UserRegistration userReg = userRegistrationRepository.save(userRegistration);
			UserRegistrationDto uDto = mapper.map(userReg, UserRegistrationDto.class);
			return responseUtility.getResponseEntity(uDto, MessageCode.USER_CREATED);
		} catch (Exception e) {
			return responseUtility.getResponseEntity(null, MessageCode.USER_CREATED);
		}
	}

}
