package com.agenda.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.domain.exception.ContatoException;
import com.agenda.domain.model.Contato;
import com.agenda.domain.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	ContatoRepository contatoRepository;
	
	public Contato salvar(Contato contato) {
		
		Contato contatoExistente = contatoRepository.findByEmail(contato.getEmail());
		if(contatoExistente != null && !contatoExistente.equals(contato)) {
			throw new ContatoException("Já existe um contato cadastrado com este email");
		}
		
		return contatoRepository.save(contato);
	}
	
}
