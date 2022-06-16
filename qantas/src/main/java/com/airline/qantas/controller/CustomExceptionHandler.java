/**
* The CustomExceptionHandler contains all the custom exception handler
*
* @author  Sunil Mehettar
* @version 1.0
* @since   2022-06-16 
*/
package com.airline.qantas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.airline.qantas.exception.ErrorDetails;
import com.airline.qantas.exception.NoDataException;

@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * handleNoDataException
	 * 
	 * @param ex      - NoDataException object
	 * @param request - WebRequest request
	 * @return errorDetails
	 */
	@ExceptionHandler(NoDataException.class)
	public final ResponseEntity<ErrorDetails> handleNoDataException(NoDataException ex) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
