package com.tetrasoft.us.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tetrasoft.us.exception.AddingFlightException;
import com.tetrasoft.us.model.ApiResponse;

@ControllerAdvice
public class AddFlightCustomerExceptionHandler {
	
	
	@ExceptionHandler(value = AddingFlightException.class)
	@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
	@ResponseBody
	public ApiResponse handleFlightAddingException(AddingFlightException ex) {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setStatus(false);
		apiResponse.setMessage(ex.getMessage());
		return apiResponse;
	}
	
	

}
