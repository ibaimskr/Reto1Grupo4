package com.example.demo.service.departament;

import java.util.List;

import com.example.demo.model.departament.Departament;
import com.example.demo.model.departament.DepartamentServiceResponse;
import com.example.demo.model.employee.EmployeeServiceResponse;

public interface CancionesService {
	List<CancionesServiceResponse> getAllCanciones();
	CancionesServiceResponse getDepartamentById(long id);
	

}
