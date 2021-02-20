package com.agenda.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode(of = {"id"})
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Long id;
	@Getter
	@Setter
	private String nome;
	@Getter
	@Setter
	private String email;
	@Getter
	@Setter
	private String telefone1;
	@Getter
	@Setter
	private String telefone2;
	
	
}
