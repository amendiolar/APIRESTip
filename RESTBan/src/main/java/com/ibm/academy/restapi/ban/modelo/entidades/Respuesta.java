package com.ibm.academy.restapi.ban.modelo.entidades;

public class Respuesta 
{
	private String mensaje;
	
	public Respuesta(String mensaje)
	{
		this.mensaje = mensaje;
	}
	
	public String getMensaje()
	{
		return mensaje;
	}
	
	public void setMensaje(String mensaje)
	{
		this.mensaje = mensaje;
	}

}
