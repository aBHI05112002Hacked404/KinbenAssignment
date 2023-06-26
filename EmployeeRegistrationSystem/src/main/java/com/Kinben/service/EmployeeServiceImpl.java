package com.Kinben.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kinben.dao.EmployeeDao;
import com.Kinben.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> opt=employeeDao.findById(id);
		
		Employee employee=null;
		
		if(opt.isPresent()) {
			employee=opt.get();
		}
		else {
			throw new RuntimeException("Employee not find: ");
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);
	}

}
