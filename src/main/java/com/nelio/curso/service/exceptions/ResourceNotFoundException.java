package com.nelio.curso.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
		
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Nao existem usuarios cadastrados para o ID " + id);
	}
}
