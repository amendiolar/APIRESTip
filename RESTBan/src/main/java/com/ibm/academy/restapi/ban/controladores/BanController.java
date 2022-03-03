package com.ibm.academy.restapi.ban.controladores;

import java.util.Optional;

import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academy.restapi.ban.modelo.entidades.Ban;
import com.ibm.academy.restapi.ban.servicios.BanDAO;

@RestController
@RequestMapping("/ban")
public class BanController 
{
	private final static Logger logger = LoggerFactory.getLogger(BanController.class);
	
	@Autowired
	private BanDAO banDao;
	
	/**
	 * Endpoint para consultar si la IP se encuentra en la lista negra
	 * @return Retorna la IP si no se encuentra en la lista negra
	 * @author AMR - 25-02-2022
	 */
	
	@GetMapping("/validar/ip/{ip}")
	public ResponseEntity<?> findByIp(@PathVariable String ipConsulta)
	{
		Iterable ban = banDao.findByIp(ipConsulta);
			JOptionPane.showMessageDialog(null,"La ip consultada se encuentra en la Lista Negra");
		return new ResponseEntity<Iterable>(ban, HttpStatus.OK);
	}
	
}
