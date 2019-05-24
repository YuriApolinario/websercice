package br.apolinario.webservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import br.apolinario.webservice.dao.DAOEstado;
import br.apolinario.webservice.entidade.Estado;

public class RestCidade  {
	@Autowired
	private DAOEstado dao;
	
	public void salvar(@RequestBody Estado cidade) {
		dao.save(cidade);
		
	}
	
}
