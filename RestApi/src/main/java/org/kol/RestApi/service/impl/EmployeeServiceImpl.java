package org.kol.RestApi.service.impl;
import java.util.List;

import org.kol.RestApi.entity.Employee;
import org.kol.RestApi.repository.EmployeeRepository;
import org.kol.RestApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee updateEmployee) {
        Employee savedEmployee = employeeRepository.findById(id).get();
        savedEmployee.setName(updateEmployee.getName());
        savedEmployee.setEmail(updateEmployee.getEmail());
        return employeeRepository.save(savedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
