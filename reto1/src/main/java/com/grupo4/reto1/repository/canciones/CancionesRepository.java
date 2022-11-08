package com.grupo4.reto1.repository.canciones;

import java.util.List;

import com.grupo4.reto1.model.canciones.Canciones;

public interface CancionesRepository {

	List<Canciones> findAll();
	Canciones getCanciones(String id);
	//Canciones findById(String id);
	//int create(Usuarios usuario);
	//int update(Usuarios usuario);
	//int deleteById(String email);

	
}

