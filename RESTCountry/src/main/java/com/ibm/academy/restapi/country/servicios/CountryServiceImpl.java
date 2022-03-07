package com.ibm.academy.restapi.country.servicios;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.academy.restapi.country.modelo.entidades.Country;

@Service
public class CountryServiceImpl implements ICountryService
{
	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public String checkByIp(String ip)
	{
		String ip1 = clienteRest.getForObject("http://localhost:8081/api/v1/rest-ban/ban/validar/ip/{ip}", String.class);
		return ip1;
	}
	
	@Override
	public Country findByIp(String ipCountry) 
	{
		Json <Country> country =
				clienteRest.getForObject("http://api.ipapi.com/api/{ip}", ipCountry);
		String pais = country.getString("country_name");
		String codigo = country.getString("currency.code");
		return pais, codigo;
	}

	@Override
	public Country findByCountryName(String countryName) 
	{
		return null;
	}

	@Override
	public Country findByCurrency(String baseCurrency) 
	{
		return null;
	}

}
