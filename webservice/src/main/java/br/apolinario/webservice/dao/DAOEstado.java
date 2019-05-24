package br.apolinario.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.apolinario.webservice.entidade.Estado;

public interface DAOEstado extends JpaRepository<Estado, Integer> {

}
