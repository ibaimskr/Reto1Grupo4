package com.example.demo.service.departament;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.departament.Departament;
import com.example.demo.model.departament.DepartamentServiceResponse;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.employee.EmployeeServiceResponse;
import com.example.demo.repository.departament.DepartamentRepository;
import com.example.demo.service.employee.EmployeeService;

@Service
public class CancionesServiceImpl implements CancionesService{

	
	@Autowired
	CancionesService cancionesService;
	@Autowired
	CancionesRepository cancionesRepository;
	
	@Override
	public List<CancionesServiceResponse> getAllCanciones() {
		List<CancionesServiceResponse> response = new ArrayList<CancionesServiceResponse>();
		List<Canciones> cancionesList = cancionesRepository.findAll();
		for (Canciones cancion : cancionList){
			response.add(new CancionesServiceResponse(
			cancion.get(),
			cancion.getName(),
			cancion.getCity(),
			null
			));
		}
		return response;
	}

	@Override
	public CancionesServiceResponse getCancionById(long id) {
		Canciones cancion= cancionesRepository.findById(id);
		return new CancionesServiceResponse(
				cancion.getId(),
				cancion.getName(),
				cancion.getCity(),
				null
				);
	}

	
}
	


