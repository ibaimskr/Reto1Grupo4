package com.grupo4.reto1.repository.favoritos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.grupo4.reto1.model.favoritos.Favoritos;

public class JdbcFavoritosRepository implements FavoritosRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	
	@Override
	public List<Favoritos> findAll(Long idUser) {
		try {
			return jdbcTemplate.query(
					"SELECT * FROM favoritos where idUser = ?",
					BeanPropertyRowMapper.newInstance(Favoritos.class), idUser);
				}catch(IncorrectResultSizeDataAccessException e) {
					return null;
				}
	}



	

	@Override
	public int create(Favoritos favorito) {
		return jdbcTemplate.update(
				"INSERT INTO favoritos (idUser, idSong) VALUES(?, ?)",
				new Object[] { 
						favorito.getIdUser(), 
						favorito.getIdSong(),
						
						
					}
				);
	}



}
