package com.grupo4.reto1.repository.usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.grupo4.reto1.model.usuarios.Usuarios;

public class JdbcUsuariosRepository implements UsuariosRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*
	@Override
	public List<Employee> getEmployeesByDepartamentId(Long DepartamentId) {
		return jdbcTemplate.query("SELECT * FROM employees WHERE departamentId = ?",
				BeanPropertyRowMapper.newInstance(Employee.class), DepartamentId);
	}
	*/
	
	@Override
	public Usuarios getUsuarios(String email) {
		return jdbcTemplate.queryForObject(
				"SELECT * FROM usuarios WHERE email = ?",
				BeanPropertyRowMapper.newInstance(Usuarios.class),
				email);
	}
	
	@Override
	public List<Usuarios> findAll() {
		try {
			return jdbcTemplate.query(
					"SELECT * FROM usuarios",
					BeanPropertyRowMapper.newInstance(Usuarios.class));
				}catch(IncorrectResultSizeDataAccessException e) {
					return null;
				}
	}



	@Override
	public Usuarios findById(String email) {
		return jdbcTemplate.queryForObject("SELECT * FROM usuarios where email = ?", BeanPropertyRowMapper.newInstance(Usuarios.class), email);
	}

	@Override
	public int create(Usuarios usuario) {
		return jdbcTemplate.update(
				"INSERT INTO usuarios (nombre, apellidos, email, password) VALUES(?, ?, ?, ?)",
				new Object[] { 
						usuario.getNombre(), 
						usuario.getApellidos(),
						usuario.getEmail(), 
						usuario.getPassword(), 
						
					}
				);
	}
/*
	@Override
	public int update(Usuarios usuario) {
		return jdbcTemplate.update(
				"UPDATE  usuarios SET nombre = ?, apellidos = ?, email = ?, password = ?) WHERE email =?",
				new Object[] { 
						usuario.getNombre(), 
						usuario.getApellidos(),
						usuario.getEmail(), 
						usuario.getPassword(), 
						
					}
				);
	}
*/
	@Override
	public int deleteById(String email) {
		return jdbcTemplate.update("DELETE FROM usuarios WHERE email=?", email);
	}

}
