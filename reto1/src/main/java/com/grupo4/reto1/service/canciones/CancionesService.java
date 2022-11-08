package com.example.demo.service.departament;

import java.util.List;

import com.example.demo.model.departament.Departament;
import com.example.demo.model.departament.DepartamentServiceResponse;
import com.example.demo.model.employee.EmployeeServiceResponse;

public interface DepartamentService {
	List<DepartamentServiceResponse> getAllDepartaments();
	DepartamentServiceResponse getDepartamentById(long id);
	int createDepartament(Departament departament);
	int updateDepartament(Departament departament);
	int deleteDepartamentById(long id);
	List<EmployeeServiceResponse> getDepartamentEmployees(long departamentId);
	DepartamentServiceResponse getDepartamentWithEmployees(long id);

}
