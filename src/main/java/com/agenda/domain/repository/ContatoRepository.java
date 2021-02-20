package com.agenda.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.domain.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
