package com.ibm.academy.restapi.ban.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IpConsulta 
{
	private String ipConsulta;
	
	public IpConsulta(String ipConsulta)
	{
		this.ipConsulta = ipConsulta;
	}
	
}
