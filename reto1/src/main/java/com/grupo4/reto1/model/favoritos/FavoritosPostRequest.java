package com.grupo4.reto1.model.favoritos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class FavoritosPostRequest {
	@NotNull(message= "No puede ser nulo")
	@NotEmpty(message= "No puede ser nulo")
	@NotBlank(message= "No puede ser nulo")
	private Long idUser;
	@NotNull(message= "No puede ser nulo")
	@NotEmpty(message= "No puede ser nulo")
	@NotBlank(message= "No puede ser nulo")
	private Long idSong;


public FavoritosPostRequest() {};

public FavoritosPostRequest(@NotNull(message= "No puede ser nulo")
@NotEmpty(message= "No puede ser nulo")
@NotBlank(message= "No puede ser nulo")Long idUser, @NotNull(message= "No puede ser nulo")
@NotEmpty(message= "No puede ser nulo")
@NotBlank(message= "No puede ser nulo")Long idSong) {
	super();
	this.idUser = idUser;
	this.idSong = idSong;
}

public Long getIdUser() {
	return idUser;
}

public void setIdUser(Long idUser) {
	this.idUser = idUser;
}

public Long getIdSong() {
	return idSong;
}

public void setIdSong(Long idSong) {
	this.idSong = idSong;
}
}