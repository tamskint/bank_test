package com.bank.test.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundClientException extends RuntimeException {

	public NotFoundClientException(Long id) {
		super(String.format("Client '%d' not found", id));
	}

}
