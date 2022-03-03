package com.ibm.academy.restapi.country.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Ban implements Serializable
{
	private Long id;
	private String ip;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private Date fechaModificacion;
}
