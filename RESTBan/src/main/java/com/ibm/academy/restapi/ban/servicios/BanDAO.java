package com.ibm.academy.restapi.ban.servicios;

import java.util.Optional;

import com.ibm.academy.restapi.ban.modelo.entidades.Ban;

public interface BanDAO
{
	public Ban guardar(Ban ban);
	
	public Iterable<Ban> buscarTodos();
	
	public void eliminarPorId(Long id);
	
	public String buscarPorIp(String ip);
	
	public Iterable<Ban> findByIp(String ipConsulta);

	
}
