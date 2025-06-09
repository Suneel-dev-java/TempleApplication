package com.dgsvtml.config;

public enum MessageCode {
	
	USER_CREATED(1100, "User Created Successfully");

	private final int code;
    private final String message;

    MessageCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
