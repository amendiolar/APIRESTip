package com.ibm.academy.restapi.ban.modelo.excepciones;

public class NotFoundException extends RuntimeException
{
	public NotFoundException(String mensaje)
	{
		super(mensaje);
	}
	
	
}
