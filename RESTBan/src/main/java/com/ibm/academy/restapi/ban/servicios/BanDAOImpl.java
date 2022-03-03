package com.ibm.academy.restapi.ban.servicios;

import java.util.List;
import java.util.Optional;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academy.restapi.ban.modelo.entidades.Ban;
import com.ibm.academy.restapi.ban.modelo.entidades.Respuesta;
import com.ibm.academy.restapi.ban.modelo.excepciones.NotFoundException;
import com.ibm.academy.restapi.ban.repositorios.BanRepository;


@Service
public class BanDAOImpl implements BanDAO
{
	@Autowired
	private BanRepository banrepository;
	
	@Override
	@Transactional
	public Ban guardar(Ban ban) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Ban> buscarTodos() 
	{
		return (List<Ban>) banrepository.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String buscarPorIp(String ip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Iterable<Ban> findByIp(String ipConsulta) 
	{
		Iterable<Ban> oBan = banrepository.findByIp(ipConsulta);
		
		if(oBan.equals(ipConsulta))
			//new Respuesta("La ip consultada se encuentra en la Lista Negra");
			JOptionPane.showMessageDialog(null,"La ip consultada se encuentra en la Lista Negra");
		
		return oBan;
	}


	

}
