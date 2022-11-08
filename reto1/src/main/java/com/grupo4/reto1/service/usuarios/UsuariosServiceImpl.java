package com.example.demo.service.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.employee.Employee;
import com.example.demo.model.employee.EmployeeServiceResponse;
import com.example.demo.repository.employee.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<EmployeeServiceResponse> getAllEmployees() {
		List<EmployeeServiceResponse> response = new ArrayList<EmployeeServiceResponse>();
		List<Employee> employeeList = employeeRepository.findAll();
		for (Employee employee : employeeList) {
			response.add(new EmployeeServiceResponse(
					employee.getId(),
					employee.getName(),
					employee.getPosition(),
					employee.getSalary(),
					employee.getBossId(),
					employee.getDepartamentId(),
					null
					//employee.getBoss()
			));
		}
		return response;
	}

	@Override
	public EmployeeServiceResponse getEmployeeById(long id) {
		Employee employee = employeeRepository.findById(id);
		return new EmployeeServiceResponse(
				employee.getId(),
				employee.getName(),
				employee.getPosition(),
				employee.getSalary(),
				employee.getBossId(),
				employee.getDepartamentId(),
				null
				);
	}

	@Override
	public int createEmployee(Employee employee) {
		return employeeRepository.create(employee);
	}

	@Override
	public int updateEmployee(Employee employee) {
		return employeeRepository.update(employee);
	}

	@Override
	public int deleteEmployeeById(long id) {
		return employeeRepository.deleteById(id);
	}

	@Override
	public EmployeeServiceResponse getEmployeeWithBoss(long id) {
		EmployeeServiceResponse employee = getEmployeeById(id);
		EmployeeServiceResponse boss = getEmployeeById(employee.getBossId());
		employee.setBoss(boss);
		return employee;
		
	}

	@Override
	public List<EmployeeServiceResponse> getEmployeesByDepartamentId(long id) {
		List<EmployeeServiceResponse> response = new ArrayList<EmployeeServiceResponse>();
		List<Employee> employeeList = employeeRepository.getEmployeesByDepartamentId(id);
		
		for (Employee employee : employeeList) {
			response.add(new EmployeeServiceResponse(
					employee.getId(),
					employee.getName(),
					employee.getPosition(),
					employee.getSalary(),
					employee.getBossId(),
					employee.getDepartamentId(),
					null
					
					));
		}
		return response;
	}

}
