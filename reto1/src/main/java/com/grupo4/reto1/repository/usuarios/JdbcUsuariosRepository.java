package com.grupo4.reto1.repository.usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.model.employee.Employee;
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
		/return jdbcTemplate.update(
				"INSERT INTO usuarios (nombre, apellidos, email, password, departamentId) VALUES(?, ?, ?, ?, ?)",
				new Object[] { 
						employee.getName(), 
						employee.getPosition(),
						employee.getSalary(), 
						employee.getBossId(), 
						employee.getDepartamentId()
					}
				);
	}

	@Override
	public int create(Usuarios usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuarios usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

}
