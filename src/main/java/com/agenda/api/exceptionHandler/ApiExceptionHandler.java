package com.agenda.api.exceptionHandler;

import java.time.OffsetDateTime;
import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.agenda.domain.exception.ContatoException;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(ContatoException.class)
	public ResponseEntity<Object> handleContato(ContatoException ex, WebRequest request){
		var status = HttpStatus.BAD_REQUEST;
		var problema = new Problema();
		problema.setStatus(status.value());
		problema.setTitulo(ex.getMessage());
		problema.setData_hora(OffsetDateTime.now());
		return handleExceptionInternal(ex, problema, new HttpHeaders(), status, request);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		var campos = new ArrayList<Problema.Campo>();
		for(ObjectError err : ex.getBindingResult().getAllErrors()) {
			String nome = ((FieldError) err).getField();
			String mensagem = err.getDefaultMessage();
			campos.add(new Problema.Campo(nome, mensagem));
		}
		
		var problema = new Problema();
		problema.setCampos(campos);
		problema.setStatus(status.value());
		problema.setData_hora(OffsetDateTime.now());
		problema.setTitulo("Um ou mais campos estão inválidos. Faça o preechimento correto e tente novamente.");
		
		return super.handleExceptionInternal(ex, problema ,headers, status, request);
	}
	
}
