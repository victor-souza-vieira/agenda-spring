package com.agenda.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.domain.model.Contato;
import com.agenda.domain.repository.ContatoRepository;

import javassist.NotFoundException;

@RestController
@RequestMapping("agenda")
public class AgendaController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping
	public List<Contato> listar() {
		return contatoRepository.findAll();
	}
	
	@GetMapping("/{idContato}")
	public Contato buscar(@PathVariable Long idContato) throws NotFoundException {
		Contato contato = contatoRepository.findById(idContato)
				.orElseThrow(() -> new NotFoundException("Contato não encontrado"));
		return contato;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contato adicionar(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}
	
	@PutMapping("/{idContato}")
	@ResponseStatus(HttpStatus.OK)
	public Contato editar(@PathVariable Long idContato, @RequestBody Contato contato) throws NotFoundException {
		Contato existe = contatoRepository.findById(idContato)
				.orElseThrow(() -> new NotFoundException("Contato não encontrado"));
		contato.setId(existe.getId());
		return contatoRepository.save(contato);
	}
	
	@DeleteMapping("/{idContato}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletar(@PathVariable Long idContato) throws NotFoundException {
		Contato contato = contatoRepository.findById(idContato)
				.orElseThrow(() -> new NotFoundException("Contato não encontrado"));
		contato.setId(idContato);
		contatoRepository.delete(contato);	
	}
}
