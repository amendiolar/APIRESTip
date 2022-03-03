package com.ibm.academy.restapi.ban.repositorios;

import java.util.Optional;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academy.restapi.ban.modelo.entidades.Ban;


@Repository
public interface BanRepository extends PagingAndSortingRepository<Ban, Long>
{
	//public String findByIp(String ip);
	
	public Iterable<Ban> findByIp(String ipConsulta);
	
}
