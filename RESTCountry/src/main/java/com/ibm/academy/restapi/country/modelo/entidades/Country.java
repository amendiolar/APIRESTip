package com.ibm.academy.restapi.country.modelo.entidades;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Country implements Serializable
{
	private Ban ban;
	private String ipCountry;
	private String countryName;
	private String countryIso;
	private String baseCurrency;
	
	
	public Country(Ban ban)
	{
		this.ban = ban;
		this.ipCountry = ipCountry;
		this.countryName = countryName;
		this.countryIso = countryIso;
		this.baseCurrency = baseCurrency;
	}
}
