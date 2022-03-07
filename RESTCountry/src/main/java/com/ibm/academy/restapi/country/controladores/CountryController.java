package com.ibm.academy.restapi.country.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academy.restapi.country.servicios.ICountryService;

@RestController
@RequestMapping("/country")
public class CountryController 
{
	@Autowired
	private ICountryService countryService;
	
	
}
