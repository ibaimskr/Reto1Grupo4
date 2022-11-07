package com.grupo4.reto1.model.canciones;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CancionesPostRequest {
	@NotNull(message= "No puede ser nulo")
	@NotEmpty(message= "No puede ser nulo")
	@NotBlank(message= "No puede ser nulo")
	private String titulo;
	@NotNull(message= "No puede ser nulo")
	@NotEmpty(message= "No puede ser nulo")
	@NotBlank(message= "No puede ser nulo")
	private String autor;
	@NotNull(message= "No puede ser nulo")
	@NotEmpty(message= "No puede ser nulo")
	@NotBlank(message= "No puede ser nulo")
	private String url;

	public CancionesPostRequest() { }
	
	public CancionesPostRequest( @NotNull(message= "No puede ser nulo")
	@NotEmpty(message= "No puede ser nulo")
	@NotBlank(message= "No puede ser nulo")String titulo, @NotNull(message= "No puede ser nulo")
	@NotEmpty(message= "No puede ser nulo")
	@NotBlank(message= "No puede ser nulo")String autor, @NotNull(message= "No puede ser nulo")
	@NotEmpty(message= "No puede ser nulo")
	@NotBlank(message= "No puede ser nulo")String url) {
		super();
		
		this.titulo = titulo;
		this.autor = autor;
		this.url = url;
	}

	

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}