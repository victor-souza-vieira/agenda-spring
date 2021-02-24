package com.agenda.api.exceptionHandler;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class Problema {


	private Integer status;
	private OffsetDateTime data_hora;
	private String titulo;
	private List<Campo> campos;
	
	
	@AllArgsConstructor
	@Data
	public static class Campo{
		private String nome;
		private String mensagem;	
	}
	
}













