package com.dgsvtml.utility;

import com.dgsvtml.config.MessageCode;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Response {

	private int code;
	private String message;
	private Object data;

	public Response(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Response(MessageCode code, String message, Object data) {
		this.code = code.getCode();
		this.message = message;
		this.data = data;
	}

}
