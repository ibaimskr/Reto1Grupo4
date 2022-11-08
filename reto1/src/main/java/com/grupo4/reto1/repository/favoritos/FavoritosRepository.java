package com.grupo4.reto1.repository.favoritos;

import java.util.List;

import com.grupo4.reto1.model.favoritos.Favoritos;

public interface FavoritosRepository {

	List<Favoritos> findAll(Long idUser);
	//Usuarios getUsuarios(String email);
	//Usuarios findById(Long idUser);
	int create(Favoritos favorito);
	//int update(Usuarios usuario);
	//int deleteById(String email);

	
}

