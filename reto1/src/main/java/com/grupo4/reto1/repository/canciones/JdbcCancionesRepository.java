package com.grupo4.reto1.repository.canciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.grupo4.reto1.model.canciones.Canciones;

public class JdbcCancionesRepository implements CancionesRepository{
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
	public Canciones getCanciones(String id) {
		return jdbcTemplate.queryForObject(
				"SELECT * FROM canciones WHERE id = ?",
				BeanPropertyRowMapper.newInstance(Canciones.class),
				id);
	}
	
	@Override
	public List<Canciones> findAll() {
		try {
			return jdbcTemplate.query(
					"SELECT * FROM canciones",
					BeanPropertyRowMapper.newInstance(Canciones.class));
				}catch(IncorrectResultSizeDataAccessException e) {
					return null;
				}
	}



//	@Override
//	public Canciones findById(String email) {
//		/return jdbcTemplate.update(
//				"INSERT INTO usuarios (nombre, apellidos, email, password, departamentId) VALUES(?, ?, ?, ?, ?)",
//				new Object[] { 
//						employee.getName(), 
//						employee.getPosition(),
//						employee.getSalary(), 
//						employee.getBossId(), 
//						employee.getDepartamentId()
//					}
//				);
//	}

//	@Override
//	public int create(Canciones cancion) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int update(Canciones cancion) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int deleteById(String email) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
