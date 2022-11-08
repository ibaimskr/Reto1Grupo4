package com.grupo4.reto1.repository.usuarios;

import java.util.List;

import com.grupo4.reto1.model.usuarios.Usuarios;

public interface UsuariosRepository {

	List<Usuarios> findAll();
	Usuarios getUsuarios(String email);
	Usuarios findById(String email);
	int create(Usuarios usuario);
	//int update(Usuarios usuario);
	int deleteById(String email);

	
}

