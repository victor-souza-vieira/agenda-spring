package com.agenda.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.agenda.domain.service.ContatoService;


@RestController
@RequestMapping("contatos")
public class AgendaController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private ContatoService contatoService;
	
	@GetMapping
	public List<Contato> listar() {
		return contatoRepository.findAll();
	}
	
	@GetMapping("/{idContato}")
	public ResponseEntity<Contato> buscar(@PathVariable Long idContato) {
		Optional<Contato> contato = contatoRepository.findById(idContato);
		
		if(contato.isPresent()) {
			return ResponseEntity.ok(contato.get());
		}
				
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contato adicionar(@Valid @RequestBody Contato contato) {
		return contatoService.salvar(contato);
	}
	
	@PutMapping("/{idContato}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Contato> editar(@PathVariable Long idContato, @RequestBody Contato contato){
		
		
		if(contatoRepository.existsById(idContato)) {
			contato.setId(idContato);
			return ResponseEntity.ok(contatoRepository.save(contato));
		}		
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{idContato}")
	public ResponseEntity<Void> deletar(@PathVariable Long idContato)  {
		Optional<Contato> contato = contatoRepository.findById(idContato);
		
		if(contato.isPresent()) {
			contatoRepository.delete(contato.get());
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
			
	}
}
