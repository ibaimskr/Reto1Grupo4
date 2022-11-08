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
public class DepartamentServiceImpl implements DepartamentService{

	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	DepartamentRepository departamentRepository;
	
	@Override
	public List<DepartamentServiceResponse> getAllDepartaments() {
		List<DepartamentServiceResponse> response = new ArrayList<DepartamentServiceResponse>();
		List<Departament> departamentList = departamentRepository.findAll();
		for (Departament departament : departamentList){
			response.add(new DepartamentServiceResponse(
			departament.getId(),
			departament.getName(),
			departament.getCity(),
			null
			));
		}
		return response;
	}

	@Override
	public DepartamentServiceResponse getDepartamentById(long id) {
		Departament departament = departamentRepository.findById(id);
		return new DepartamentServiceResponse(
				departament.getId(),
				departament.getName(),
				departament.getCity(),
				null
				);
	}

	@Override
	public int createDepartament(Departament departament) {
		return departamentRepository.create(departament);
	}

	@Override
	public int updateDepartament(Departament departament) {
		return departamentRepository.update(departament);
	}

	@Override
	public int deleteDepartamentById(long id) {
		return departamentRepository.deleteById(id);
	}

	@Override
	public List<EmployeeServiceResponse> getDepartamentEmployees(long departamentId) {
		return employeeService.getEmployeesByDepartamentId(departamentId);
	}

	@Override
	public DepartamentServiceResponse getDepartamentWithEmployees(long id) {
		DepartamentServiceResponse response = getDepartamentById(id);
		List<EmployeeServiceResponse> employee = employeeService.getEmployeesByDepartamentId(id);
		response.setEmployeeList(employee);
		
		return response;
	}
}
	


