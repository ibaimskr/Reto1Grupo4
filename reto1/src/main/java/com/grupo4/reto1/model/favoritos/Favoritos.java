package com.grupo4.reto1.model.favoritos;

public class Favoritos {
	private Long idUser;
	private Long idSong;



public Favoritos() {};

public Favoritos(Long idUser, Long idSong) {
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

@Override
public String toString() {
	return "favoritos [idUser=" + idUser + ", idSong=" + idSong + "]";
}


}