package com.dgsvtml.utility;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dgsvtml.config.MessageCode;

@Service
public class ResponseUtility {
	public ResponseEntity<Response> getResponseEntity(Object data, MessageCode messageCode) {
		Response response = new Response(messageCode.getCode(), messageCode.getMessage(), data);
		return ResponseEntity.ok(response);
	}

}
