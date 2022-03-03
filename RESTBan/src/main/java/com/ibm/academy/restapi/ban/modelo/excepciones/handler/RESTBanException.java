package com.ibm.academy.restapi.ban.modelo.excepciones.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ibm.academy.restapi.ban.modelo.excepciones.NotFoundException;

@ControllerAdvice
public class RESTBanException 
{
	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<?> noExisteBanException(NotFoundException exception)
	{
		Map<String, Object> respuesta = new HashMap<String, Object>();
		respuesta.put("error", exception.getMessage());
		return new ResponseEntity<>(respuesta, HttpStatus.NOT_FOUND);
	}
}
