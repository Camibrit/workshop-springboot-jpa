package com.educandoweb.curso.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
 
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object resourceId) {
        super("Resource not found with ID: " + resourceId);
    }
}
