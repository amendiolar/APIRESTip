package com.ibm.academy.restapi.country.servicios;

import com.ibm.academy.restapi.country.modelo.entidades.Country;

public interface CountryDAO 
{
	public String checkByIp(String ip);
	public Country findByIp(String ipCountry);
	public Country findByCountryName(String countryName);
	public Country findByCurrency(String baseCurrency);
	
}
